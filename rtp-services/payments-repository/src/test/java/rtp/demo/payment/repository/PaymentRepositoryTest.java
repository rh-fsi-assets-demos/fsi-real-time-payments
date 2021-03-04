package rtp.demo.payment.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import rtp.demo.domain.payment.Payment;

import java.util.List;

import static org.junit.Assert.assertEquals;

//@RunWith(SpringRunner.class)
//@DataJpaTest
// Test against db connection in src/test/resources/application.properties:
//@AutoConfigureTestDatabase(replace = Replace.NONE)
// Test against h2:
//@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class PaymentRepositoryTest {

//	@Autowired
//	private PaymentRepository paymentRepository;
//
//	@Test
//	public void testFindByPaymentId() {
//		Payment testPayment = makeTestPayment();
//
//		paymentRepository.save(testPayment);
//
//		List<Payment> payments = paymentRepository.findByPaymentId("PAY123");
//		assertEquals(1, payments.size());
//
//		Payment retrievedPayment = payments.get(0);
//		assertEquals("PAY123", retrievedPayment.getDomesticPaymentId());
//		assertEquals(testPayment, retrievedPayment);
//	}
//
//	@Test
//	public void testFindByPaymentIdNoResult() {
//		Payment testPayment = makeTestPayment();
//
//		paymentRepository.save(testPayment);
//
//		List<Payment> payments = paymentRepository.findByPaymentId("PAY124");
//		assertEquals(0, payments.size());
//	}

	private Payment makeTestPayment() {
		Payment testPayment = new Payment();
//		testPayment.setPaymentId("PAY123");
//		testPayment.setDebtorAccountNumber("123456789");
//
//		testPayment.setCreditorAccountNumber("987654321");
//
//		testPayment.setAmount("107.25");
//		testPayment.setTransactionType("DEBIT");
//
//		testPayment.setDebtorFirstName("John");
//		testPayment.setDebtorLastName("Smith");
//		testPayment.setDebtorAddressLine1("555 Main St.");
//		testPayment.setDebtorAddressLine2("Apt 2");
//		testPayment.setDebtorCity("OurTown");
//		testPayment.setDebtorState("TX");
//		testPayment.setDebtorCountry("USA");
//		testPayment.setDebtorPostalCode("12345");
//
//		testPayment.setCreditorFirstName("Jane");
//		testPayment.setCreditorLastName("Cruz");
//
//		testPayment.setDebtorAgentFinancialInstitutionId("1111111111");
//		testPayment.setCreditorAgentFinancialInstitutionId("2222222222");

		return testPayment;
	}

}
