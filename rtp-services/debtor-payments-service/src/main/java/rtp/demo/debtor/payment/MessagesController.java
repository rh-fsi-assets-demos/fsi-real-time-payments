package rtp.demo.debtor.payment;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import rtp.demo.debtor.payment.producer.DebtorPaymentsProducer;
import rtp.demo.domain.OBWriteDomestic2;
import rtp.demo.domain.OBWriteDomesticResponse5;
import rtp.demo.domain.account.Account;
import rtp.demo.domain.account.OBAccount4Account;
import rtp.demo.domain.account.OBAccount6;
import rtp.demo.domain.account.OBReadAccount5;
import rtp.demo.domain.account.OBReadBalance1;
import rtp.demo.domain.account.OBReadBalance1DataAmount;
import rtp.demo.domain.account.OBReadBalance1DataBalance;
import rtp.demo.domain.account.OBReadTransaction6;
import rtp.demo.domain.account.OBTransaction6;
import rtp.demo.domain.OBWriteDomesticResponse5Data.StatusEnum;
import rtp.demo.domain.account.OBAccountStatus1Code;
import rtp.demo.domain.account.OBBalanceType1Code;
import rtp.demo.domain.account.OBCreditDebitCode1;
import rtp.demo.domain.account.OBCreditDebitCode2;
import rtp.demo.domain.account.OBEntryStatus1Code;
import rtp.demo.domain.account.OBExternalAccountSubType1Code;
import rtp.demo.domain.account.OBExternalAccountType1Code;
import rtp.demo.domain.payment.Payment;
import rtp.demo.payment.repository.AccountRepository;
import rtp.demo.payment.repository.PaymentRepository;

@RestController
@RequestMapping("/")
public class MessagesController {

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private AccountRepository accountRepository;

	private DebtorPaymentsProducer producer = new DebtorPaymentsProducer();

	@PostMapping("/domestic-payments")
	private Mono<ResponseEntity<OBWriteDomesticResponse5>> createDomesticPayment(
			@RequestBody OBWriteDomestic2 obPayment) {
		System.out.println("RECEIVED PAYMENT: " + obPayment);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
		LocalDateTime now = LocalDateTime.now();

		OBWriteDomesticResponse5 responseData = transformOBWriteDomestic2ToOBWriteDomesticResponse5(obPayment);
		responseData.getData().setDomesticPaymentId("PAY" + formatter.format(now));

		Payment payment = transformOBWriteDomesticResponse5ToPayment(responseData);
		payment.setStatus("payment_initiated");
		System.out.println("SAVING PAYMENT: " + payment);
		paymentRepository.save(payment);

		try {
			producer.sendMessage(payment.getDomesticPaymentId(), payment);
		} catch (Exception e) {
			System.out.println("WARN: PAYMENT EVENT NOT SENT");
			e.printStackTrace();
		}

		List<Account> debtorAccounts = (ArrayList<Account>) accountRepository
				.findByAccountIdentification(payment.getDebtorAccountIndentification());
		if (!debtorAccounts.isEmpty()) {
			Account debtorAccount = debtorAccounts.get(0);

			BigDecimal balance = new BigDecimal(debtorAccount.getBalanceAmount());
			BigDecimal paymentAmount = new BigDecimal(payment.getInitiatiionInstructedAmount());
			BigDecimal newBalance = balance.subtract(paymentAmount);

			debtorAccount.setBalanceAmount(newBalance.setScale(2, RoundingMode.CEILING).toString());
			accountRepository.save(debtorAccount);
		}

		List<Account> creditorAccounts = (ArrayList<Account>) accountRepository
				.findByAccountIdentification(payment.getCreditorAccountIndentification());
		if (!creditorAccounts.isEmpty()) {
			Account creditorAccount = creditorAccounts.get(0);

			BigDecimal balance = new BigDecimal(creditorAccount.getBalanceAmount());
			BigDecimal paymentAmount = new BigDecimal(payment.getInitiatiionInstructedAmount());
			BigDecimal newBalance = balance.add(paymentAmount);

			creditorAccount.setBalanceAmount(newBalance.setScale(2, RoundingMode.CEILING).toString());
			accountRepository.save(creditorAccount);
		}

		return Mono.just(ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(responseData));
	}

	@GetMapping("/domestic-payments/{domesticPaymentId}")
	private Mono<ResponseEntity<OBWriteDomesticResponse5>> getDomesticPayment(@PathVariable String domesticPaymentId) {
		OBWriteDomesticResponse5 obDomesticPaymentResponse = new OBWriteDomesticResponse5();

		List<Payment> payments = paymentRepository.findByDomesticPaymentId(domesticPaymentId);

		if (!payments.isEmpty()) {
			Payment payment = payments.get(0);
			obDomesticPaymentResponse = transformPaymentToOBWriteDomesticResponse5(payment);
		}

		return Mono
				.just(ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(obDomesticPaymentResponse));
	}

	@GetMapping("/accounts")
	private Mono<ResponseEntity<OBReadAccount5>> getAccounts(
			@RequestParam("accountHolderId") Optional<String> accountHolderId) {
		OBReadAccount5 obReadAccount5 = new OBReadAccount5();
		List<Account> accounts = new ArrayList<Account>();

		if (accountHolderId.isPresent()) {
			accounts = (ArrayList<Account>) accountRepository.findByAccountHolderId(accountHolderId.get());
		} else {
			accounts = (ArrayList<Account>) accountRepository.findAll();
		}
		System.out.println("RETRIEVED ACCTS: " + accounts);

		if (!accounts.isEmpty()) {
			obReadAccount5 = new OBReadAccount5();
			for (Account account : accounts) {
				OBAccount6 obAccount6 = transformAccountToOBAccount6(account);
				obReadAccount5.getData().getAccount().add(obAccount6);
			}
		}

		return Mono.just(ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(obReadAccount5));
	}

	@GetMapping("/accounts/{accountId}")
	private Mono<ResponseEntity<OBReadAccount5>> getAccountById(@PathVariable String accountId) {
		OBReadAccount5 obReadAccount5 = new OBReadAccount5();

		List<Account> accounts = (ArrayList<Account>) accountRepository.findByAccountId(accountId);
		System.out.println("RETRIEVED ACCTS: " + accounts);

		if (!accounts.isEmpty()) {
			obReadAccount5 = new OBReadAccount5();
			for (Account account : accounts) {
				OBAccount6 obAccount6 = transformAccountToOBAccount6(account);
				obReadAccount5.getData().getAccount().add(obAccount6);
			}
		}

		return Mono.just(ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(obReadAccount5));
	}

	@GetMapping("/accounts/{accountId}/balances")
	private Mono<ResponseEntity<OBReadBalance1>> getAccountBalances(@PathVariable String accountId) {
		OBReadBalance1 obReadBalance1 = new OBReadBalance1();

		List<Account> accounts = (ArrayList<Account>) accountRepository.findByAccountId(accountId);
		System.out.println("RETRIEVED ACCTS: " + accounts);

		if (!accounts.isEmpty()) {
			Account account = accounts.get(0);
			obReadBalance1 = new OBReadBalance1();
			OBReadBalance1DataBalance obReadBalance1DataBalance = new OBReadBalance1DataBalance();
			obReadBalance1DataBalance.setAccountId(account.getAccountId());
			obReadBalance1DataBalance
					.setCreditDebitIndicator(OBCreditDebitCode2.fromValue(account.getBalanceCreditDebitIndicator()));
			obReadBalance1DataBalance.setType(OBBalanceType1Code.fromValue(account.getBalanceType()));

			OBReadBalance1DataAmount obReadBalance1DataAmount = new OBReadBalance1DataAmount();
			obReadBalance1DataAmount.setAmount(account.getBalanceAmount());
			obReadBalance1DataAmount.setCurrency(account.getBalanceCurrency());

			obReadBalance1DataBalance.setAmount(obReadBalance1DataAmount);

			obReadBalance1.getData().addBalanceItem(obReadBalance1DataBalance);
		}

		return Mono.just(ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(obReadBalance1));
	}

	@GetMapping("/accounts/{accountId}/transactions")
	private Mono<ResponseEntity<OBReadTransaction6>> getAccountTransactions(@PathVariable String accountId) {
		OBReadTransaction6 obReadTransaction6 = new OBReadTransaction6();

		List<Account> accounts = accountRepository.findByAccountId(accountId);
		Account account = null;
		if (!accounts.isEmpty()) {
			account = accounts.get(0);

			List<Payment> debtorPayments = paymentRepository
					.findByDebtorAccountIndentification(account.getAccountIdentification());
			if (!debtorPayments.isEmpty()) {
				for (Payment payment : debtorPayments) {
					OBTransaction6 obTransaction6 = new OBTransaction6();
					obTransaction6.setAccountId(accountId);
					obTransaction6.setTransactionId(payment.getDomesticPaymentId());
					obTransaction6.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
					obTransaction6.setStatus(OBEntryStatus1Code.fromValue(payment.getStatus()));
					obTransaction6.getAmount().setAmount(payment.getInitiatiionInstructedAmount());
					obTransaction6.getAmount().setCurrency(payment.getInitiatiionInstructedCurrency());
					obTransaction6.getDebtorAccount().setIdentification(payment.getDebtorAccountIndentification());
					obTransaction6.getDebtorAccount().setName(payment.getDebtorAccountName());
					obTransaction6.getDebtorAccount().setSchemeName(payment.getDebtorAccountSchemeName());
					obTransaction6.getDebtorAccount()
							.setSecondaryIdentification(payment.getDebtorAccountSecondaryIdentification());

					obTransaction6.getCreditorAccount().setIdentification(payment.getCreditorAccountIndentification());
					obTransaction6.getCreditorAccount().setName(payment.getCreditorAccountName());
					obTransaction6.getCreditorAccount().setSchemeName(payment.getCreditorAccountSchemeName());
					obTransaction6.getCreditorAccount()
							.setSecondaryIdentification(payment.getCreditorAccountSecondaryIdentification());

					obReadTransaction6.getData().addTransactionItem(obTransaction6);
				}

			}

			List<Payment> creditorPayments = paymentRepository
					.findByCreditorAccountIndentification(account.getAccountIdentification());
			if (!creditorPayments.isEmpty()) {
				for (Payment payment : creditorPayments) {
					OBTransaction6 obTransaction6 = new OBTransaction6();
					obTransaction6.setAccountId(accountId);
					obTransaction6.setTransactionId(payment.getDomesticPaymentId());
					obTransaction6.setCreditDebitIndicator(OBCreditDebitCode1.CREDIT);
					obTransaction6.setStatus(OBEntryStatus1Code.fromValue(payment.getStatus()));
					obTransaction6.getAmount().setAmount(payment.getInitiatiionInstructedAmount());
					obTransaction6.getAmount().setCurrency(payment.getInitiatiionInstructedCurrency());
					obTransaction6.getDebtorAccount().setIdentification(payment.getDebtorAccountIndentification());
					obTransaction6.getDebtorAccount().setName(payment.getDebtorAccountName());
					obTransaction6.getDebtorAccount().setSchemeName(payment.getDebtorAccountSchemeName());
					obTransaction6.getDebtorAccount()
							.setSecondaryIdentification(payment.getDebtorAccountSecondaryIdentification());

					obTransaction6.getCreditorAccount().setIdentification(payment.getCreditorAccountIndentification());
					obTransaction6.getCreditorAccount().setName(payment.getCreditorAccountName());
					obTransaction6.getCreditorAccount().setSchemeName(payment.getCreditorAccountSchemeName());
					obTransaction6.getCreditorAccount()
							.setSecondaryIdentification(payment.getCreditorAccountSecondaryIdentification());

					obReadTransaction6.getData().addTransactionItem(obTransaction6);
				}
			}

		}

		return Mono.just(ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(obReadTransaction6));
	}

	private OBAccount6 transformAccountToOBAccount6(Account account) {
		OBAccount6 obAccount6 = new OBAccount6();
		obAccount6.setAccountId(account.getAccountId());
		obAccount6.setStatus(OBAccountStatus1Code.fromValue(account.getStatus()));
		obAccount6.setCurrency(account.getCurrency());
		obAccount6.setAccountType(OBExternalAccountType1Code.fromValue(account.getAccountType()));
		obAccount6.setAccountSubType(OBExternalAccountSubType1Code.fromValue(account.getAccountSubType()));
		obAccount6.setNickname(account.getNickname());

		OBAccount4Account obAccount4Account = new OBAccount4Account();
		obAccount4Account.setName(account.getAccountName());
		obAccount4Account.setSchemeName(account.getAccountSchemeName());
		obAccount4Account.setIdentification(account.getAccountIdentification());
		obAccount4Account.setSecondaryIdentification(account.getAccountSecondaryIdentification());
		obAccount6.getAccount().add(obAccount4Account);

		return obAccount6;
	}

	private Payment transformOBWriteDomesticResponse5ToPayment(OBWriteDomesticResponse5 obWriteDomesticResponse5) {
		Payment payment = new Payment();
		payment.setDomesticPaymentId(obWriteDomesticResponse5.getData().getDomesticPaymentId());

		System.out.println("DATA: " + obWriteDomesticResponse5.getData());
		System.out.println("INITIATION: " + obWriteDomesticResponse5.getData().getInitiation());
		System.out
				.println("INSTRUCTED AMT: " + obWriteDomesticResponse5.getData().getInitiation().getInstructedAmount());
		System.out.println("INSTRUCTED AMT AMT: "
				+ obWriteDomesticResponse5.getData().getInitiation().getInstructedAmount().getAmount());
		System.out.println("INSTRUCTED CUR: "
				+ obWriteDomesticResponse5.getData().getInitiation().getInstructedAmount().getCurrency());

		payment.setConsentId(obWriteDomesticResponse5.getData().getConsentId());
		// payment.setStatus(obWriteDomesticResponse5.getData().getStatus().toString());
		// payment.setCreationDateTime(obWriteDomesticResponse5.getData().getCreationDateTime().toString());
		// payment.setStatusUpdateDateTime(obWriteDomesticResponse5.getData().getStatusUpdateDateTime().toString());
		payment.setRefundAccountSchemeName(obWriteDomesticResponse5.getData().getRefund().getAccount().getSchemeName());
		payment.setRefundAccountIdentification(
				obWriteDomesticResponse5.getData().getRefund().getAccount().getIdentification());

		payment.setInitiatiionInstructedAmount(
				obWriteDomesticResponse5.getData().getInitiation().getInstructedAmount().getAmount());
		payment.setInitiatiionInstructedCurrency(
				obWriteDomesticResponse5.getData().getInitiation().getInstructedAmount().getCurrency());
		payment.setRefundAccountName(obWriteDomesticResponse5.getData().getRefund().getAccount().getName());

		payment.setInitiationInstructionIdentification(
				obWriteDomesticResponse5.getData().getInitiation().getInstructionIdentification());
		payment.setInitiationEndToEndIdentification(
				obWriteDomesticResponse5.getData().getInitiation().getEndToEndIdentification());
		payment.setInitiatiionInstructedAmount(
				obWriteDomesticResponse5.getData().getInitiation().getInstructedAmount().getAmount());
		payment.setInitiatiionInstructedCurrency(
				obWriteDomesticResponse5.getData().getInitiation().getInstructedAmount().getCurrency());

		payment.setDebtorAccountSchemeName(
				obWriteDomesticResponse5.getData().getInitiation().getDebtorAccount().getSchemeName());
		payment.setDebtorAccountIndentification(
				obWriteDomesticResponse5.getData().getInitiation().getDebtorAccount().getIdentification());
		payment.setDebtorAccountName(obWriteDomesticResponse5.getData().getInitiation().getDebtorAccount().getName());
		payment.setDebtorAccountSecondaryIdentification(
				obWriteDomesticResponse5.getData().getInitiation().getDebtorAccount().getSecondaryIdentification());

		payment.setCreditorAccountSchemeName(
				obWriteDomesticResponse5.getData().getInitiation().getCreditorAccount().getSchemeName());
		payment.setCreditorAccountIndentification(
				obWriteDomesticResponse5.getData().getInitiation().getCreditorAccount().getIdentification());
		payment.setCreditorAccountName(
				obWriteDomesticResponse5.getData().getInitiation().getCreditorAccount().getName());
		payment.setCreditorAccountSecondaryIdentification(
				obWriteDomesticResponse5.getData().getInitiation().getCreditorAccount().getSecondaryIdentification());

		return payment;
	}

	private OBWriteDomesticResponse5 transformPaymentToOBWriteDomesticResponse5(Payment payment) {
		OBWriteDomesticResponse5 obPaymentResponse = new OBWriteDomesticResponse5();

		obPaymentResponse.getData().setDomesticPaymentId(payment.getDomesticPaymentId());
		obPaymentResponse.getData().setConsentId(payment.getConsentId());
		obPaymentResponse.getData().setStatus(StatusEnum.PENDING);

		obPaymentResponse.getData().getInitiation()
				.setInstructionIdentification(payment.getInitiationInstructionIdentification());
		obPaymentResponse.getData().getInitiation()
				.setEndToEndIdentification(payment.getInitiationEndToEndIdentification());
		obPaymentResponse.getData().getInitiation().getInstructedAmount()
				.setAmount(payment.getInitiatiionInstructedAmount());
		obPaymentResponse.getData().getInitiation().getInstructedAmount()
				.setCurrency(payment.getInitiatiionInstructedCurrency());

		obPaymentResponse.getData().getInitiation().getCreditorAccount()
				.setSchemeName(payment.getCreditorAccountSchemeName());
		obPaymentResponse.getData().getInitiation().getCreditorAccount()
				.setIdentification(payment.getCreditorAccountIndentification());
		obPaymentResponse.getData().getInitiation().getCreditorAccount().setName(payment.getCreditorAccountName());
		obPaymentResponse.getData().getInitiation().getCreditorAccount()
				.setSecondaryIdentification(payment.getCreditorAccountSecondaryIdentification());

		// obPaymentResponse.getData().getRefund().getAccount().set

		return obPaymentResponse;
	}

	private OBWriteDomesticResponse5 transformOBWriteDomestic2ToOBWriteDomesticResponse5(
			OBWriteDomestic2 obWriteDomestic) {
		OBWriteDomesticResponse5 obDomesticPaymentResponse = new OBWriteDomesticResponse5();

		obDomesticPaymentResponse.getData().setConsentId(obWriteDomestic.getData().getConsentId());
//		obDomesticPaymentResponse.getData().setCreationDateTime(OffsetDateTime.now());
//		obDomesticPaymentResponse.getData().setStatusUpdateDateTime(OffsetDateTime.now());
		obDomesticPaymentResponse.getData().setInitiation(obWriteDomestic.getData().getInitiation());

		return obDomesticPaymentResponse;

	}

	private OBReadAccount5 makeDummyObReadAccount5() {
		OBReadAccount5 obReadAccount5 = new OBReadAccount5();

		OBAccount6 obAccount6_01 = new OBAccount6();
		obAccount6_01.setAccountId("22289");
		obAccount6_01.setStatus(OBAccountStatus1Code.ENABLED);
		obAccount6_01.setCurrency("GBP");
		obAccount6_01.setAccountType(OBExternalAccountType1Code.PERSONAL);
		obAccount6_01.setAccountSubType(OBExternalAccountSubType1Code.CURRENTACCOUNT);
		obAccount6_01.setNickname("Bills");
		// obAccount6_01.setOpeningDate();

		OBAccount4Account obAccount4Account_01 = new OBAccount4Account();
		obAccount4Account_01.setSchemeName("UK.OBIE.SortCodeAccountNumber");
		obAccount4Account_01.setIdentification("80200110203345");
		obAccount4Account_01.setName("Mr Kevin");
		obAccount4Account_01.setSecondaryIdentification("00021");
		obAccount6_01.getAccount().add(obAccount4Account_01);

		OBAccount6 obAccount6_02 = new OBAccount6();
		obAccount6_02.setAccountId("31820");
		obAccount6_02.setStatus(OBAccountStatus1Code.ENABLED);
		obAccount6_02.setCurrency("GBP");
		obAccount6_02.setAccountType(OBExternalAccountType1Code.PERSONAL);
		obAccount6_02.setAccountSubType(OBExternalAccountSubType1Code.CURRENTACCOUNT);
		obAccount6_02.setNickname("Household");
		OBAccount4Account obAccount4Account_02 = new OBAccount4Account();
		obAccount4Account_02.setSchemeName("UK.OBIE.SortCodeAccountNumber");
		obAccount4Account_02.setIdentification("80200110203348");
		obAccount4Account_02.setName("Mr Kevin");
		obAccount6_02.getAccount().add(obAccount4Account_02);

		obReadAccount5.getData().getAccount().add(obAccount6_01);
		obReadAccount5.getData().getAccount().add(obAccount6_02);

		return obReadAccount5;
	}

	private OBReadBalance1 makeDummyObReadBalance1() {
		OBReadBalance1 obReadBalance1 = new OBReadBalance1();

		OBReadBalance1DataBalance obReadBalance1DataBalance = new OBReadBalance1DataBalance();
		obReadBalance1DataBalance.setAccountId("22289");
		obReadBalance1DataBalance.getAmount().setAmount("3000.00");
		obReadBalance1DataBalance.getAmount().setCurrency("GBP");
		obReadBalance1DataBalance.setCreditDebitIndicator(OBCreditDebitCode2.CREDIT);
		obReadBalance1DataBalance.setType(OBBalanceType1Code.INTERIMAVAILABLE);

		obReadBalance1.getData().getBalance().add(obReadBalance1DataBalance);

		return obReadBalance1;
	}

	private OBReadTransaction6 makeDummyOBReadTransaction6OBReadAccount6() {
		OBReadTransaction6 obReadTransaction6 = new OBReadTransaction6();

		OBTransaction6 obTransaction6 = new OBTransaction6();
		obTransaction6.setAccountId("22289");
		obTransaction6.setTransactionId("123");
		obTransaction6.setTransactionReference("Reff 1");
		obTransaction6.getAmount().setAmount("10.00");
		obTransaction6.getAmount().setCurrency("GBP");
		obTransaction6.setCreditDebitIndicator(OBCreditDebitCode1.CREDIT);
		obTransaction6.setStatus(OBEntryStatus1Code.BOOKED);
		obTransaction6.setTransactionInformation("Cash from Aubrey");
		obTransaction6.getBankTransactionCode().setCode("ReceivedCreditTransfer");
		obTransaction6.getBankTransactionCode().setSubCode("DomesticCreditTransfer");
		obTransaction6.getProprietaryBankTransactionCode().setCode("Transfer");
		obTransaction6.getProprietaryBankTransactionCode().setIssuer("AlphaBank");
		obTransaction6.getBalance().getAmount().setAmount("230.00");
		obTransaction6.getBalance().getAmount().setCurrency("GBP");
		obTransaction6.getBalance().setCreditDebitIndicator(OBCreditDebitCode2.CREDIT);
		obTransaction6.getBalance().setType(OBBalanceType1Code.INTERIMBOOKED);

		obReadTransaction6.getData().getTransaction().add(obTransaction6);

		return obReadTransaction6;
	}
}
