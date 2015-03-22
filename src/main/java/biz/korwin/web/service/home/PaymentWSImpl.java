package biz.korwin.web.service.home;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

import biz.korwin.web.service.home.model.PaymentVO;
import biz.korwin.web.service.home.model.PaymentsVO;

/**
 * Web service implementation.
 * */
@Component("paymentsService")
public class PaymentWSImpl implements IPaymentWS {

	SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
	
	@Override
	public PaymentsVO getPaymentsByDate(String date) {

		
		PaymentsVO payments = new PaymentsVO();

		List<PaymentVO> paymentsList = new ArrayList<PaymentVO>();

		PaymentVO payment1 = new PaymentVO();
		payment1.setAmountInCents(12344);
		payment1.setCycle(22);
		payment1.setDueDate("20150330");
		payment1.setPaidDate(null);
		payment1.setPayee("CIBC");
		payment1.setPayeeProduct("Master Card Petro-Points");
		payment1.setPaymentLimitDate("20150328");
		
		PaymentVO payment2 = new PaymentVO();
		payment2.setAmountInCents(1234);
		payment2.setCycle(25);
		payment2.setDueDate("20150330");
		payment2.setPaidDate(null);
		payment2.setPayee("RBC");
		payment2.setPayeeProduct("VISA Gold");
		payment2.setPaymentLimitDate("20150328");

		paymentsList.add(payment1);
		paymentsList.add(payment2);
		
		payments.setPayments(paymentsList);
		
		return payments;
	}

	@Override
	public PaymentVO create(PaymentVO newPayment) {
		return newPayment;
	}

	@Override
	public Response delete(long id) {
		return Response.status(Status.OK).build();
	}

	@Override
	public PaymentVO update(long id) {
		
		PaymentVO payment = new PaymentVO();
		payment.setId(id);
		payment.setAmountInCents(12344);
		payment.setCycle(22);
		payment.setDueDate("20150330");
		payment.setPaidDate(null);
		payment.setPayee("CIBC");
		payment.setPayeeProduct("Master Card Petro-Points");
		payment.setPaymentLimitDate("20150328");
		
		return payment;
	}

	@Override
	public PaymentVO getPaymentById(long id) {
		
		PaymentVO payment = new PaymentVO();
		payment.setId(id);
		payment.setAmountInCents(12344);
		payment.setCycle(22);
		payment.setDueDate("20150330");
		payment.setPaidDate(null);
		payment.setPayee("CIBC");
		payment.setPayeeProduct("Master Card Petro-Points");
		payment.setPaymentLimitDate("20150328");
		
		return payment;
	}

	
}
