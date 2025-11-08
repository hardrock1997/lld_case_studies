package lld_case_studies.hotel_booking.factory;

import lld_case_studies.hotel_booking.data.PaymentMode;
import lld_case_studies.hotel_booking.payments.CardDetails;
import lld_case_studies.hotel_booking.payments.CardPaymentProcessor;
import lld_case_studies.hotel_booking.payments.CashPaymentProcessor;
import lld_case_studies.hotel_booking.payments.PaymentProcessor;

public class PaymentProcessorFactory {

    private PaymentProcessorFactory(){};

    public static PaymentProcessor getPaymentProcessor(PaymentMode paymentMode, CardDetails cardDetails, double amount) {
        PaymentProcessor paymentProcessor=null;
        if(paymentMode.equals(PaymentMode.CASH)) {
            paymentProcessor=new CashPaymentProcessor(amount);
        }
        if(paymentMode.equals(PaymentMode.CARD)) {
            paymentProcessor=new CardPaymentProcessor(amount, cardDetails);
        }
        return paymentProcessor;
    }
}
