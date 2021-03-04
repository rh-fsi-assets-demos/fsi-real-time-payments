package rtp.demo.payment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import rtp.demo.domain.account.Account;
import rtp.demo.domain.payment.Payment;

public interface AccountRepository extends CrudRepository<Account, Long> {

	List<Account> findByAccountHolderId(String accountHolderId);

	List<Account> findByAccountId(String accountId);

	List<Account> findByAccountIdentification(String accountIdentification);

}
