package rtp.demo.domain.payment;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FRAUD_CHECK_COMPLETE")
public class FraudCheckComplete implements Serializable {

	private static final long serialVersionUID = 6320977454651634641L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", updatable = false, unique = true)
	private BigInteger id;
	@Column(name = "DOMESTIC_PAYMENT_ID", unique = true, nullable = true, length = 256)
	private String domesticPaymentId;
	@Column(name = "ENTRYCOUNT", unique = true, nullable = true, length = 256)
	private Integer entryCount = 1;
	@Column(name = "CREATION_DATE_TIME", unique = false, nullable = true, length = 256)
	private Timestamp creationDateTime = new Timestamp(System.currentTimeMillis());

	public void setDomesticPaymentID(String ID) {
		this.domesticPaymentId = ID;
	}

	public String getDomesticPaymentID() {
		return this.domesticPaymentId;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getDomesticPaymentId() {
		return domesticPaymentId;
	}

	public void setDomesticPaymentId(String domesticPaymentId) {
		this.domesticPaymentId = domesticPaymentId;
	}

	public Integer getEntryCount() {
		return entryCount;
	}

	public void setEntryCount(Integer entryCount) {
		this.entryCount = entryCount;
	}

	public Timestamp getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(Timestamp creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

}
