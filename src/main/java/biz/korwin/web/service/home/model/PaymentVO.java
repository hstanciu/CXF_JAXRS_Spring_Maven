package biz.korwin.web.service.home.model;

import java.util.Date;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Model class. Represents a payment.
 * 
 * */
@XmlRootElement(name="payment")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentVO {
	
	/* Payment ID*/
	private long id;
	/* Who will be paid; ex: Canada Bank*/
	private String payee;
	/* The payment product; ex: Master Card Petro-Points */
	private String payeeProduct;
	/* The number of days a new statement will be issued, or -1 if is not cyclical*/
	private int cycle;
	/* Amount to be paid (in cents) */
	private int amountInCents;
	/* Due date */
	private String dueDate;
	/* In order for payment to occur at due date, the payment should occur 
	 * in advance with a couple of days. This date is the limit date when
	 * this occurs in order for due date not to be passed.*/
	private String paymentLimitDate;
	/* Date when payment happened. If it didn't happen yet,
	 * then this attribute will be null.*/	
	private String paidDate;
	
		public long getId() {
		return id;
	}
	//@FormParam("id")
	public void setId(long id) {
		this.id = id;
	}
	public String getPayee() {
		return payee;
	}
	@FormParam("payee")
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getPayeeProduct() {
		return payeeProduct;
	}
	@FormParam("payeeProduct")
	public void setPayeeProduct(String payeeProduct) {
		this.payeeProduct = payeeProduct;
	}
	public int getCycle() {
		return cycle;
	}
	@FormParam("cycle")
	public void setCycle(int cycle) {
		this.cycle = cycle;
	}
	public int getAmountInCents() {
		return amountInCents;
	}
	@FormParam("amountInCents")
	public void setAmountInCents(int amountInCents) {
		this.amountInCents = amountInCents;
	}
	public String getDueDate() {
		return dueDate;
	}
	@FormParam("dueDate")
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getPaymentLimitDate() {
		return paymentLimitDate;
	}
	@FormParam("paymentLimitDate")
	public void setPaymentLimitDate(String paymentLimitDate) {
		this.paymentLimitDate = paymentLimitDate;
	}
	public String getPaidDate() {
		return paidDate;
	}
	@FormParam("paidDate")
	public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}
}
