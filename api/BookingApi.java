package lld_case_studies.hotel_booking.api;

import lld_case_studies.hotel_booking.booking.CompleteBooking;
import lld_case_studies.hotel_booking.data.PaymentMode;
import lld_case_studies.hotel_booking.factory.PaymentProcessorFactory;
import lld_case_studies.hotel_booking.payments.CardDetails;
import lld_case_studies.hotel_booking.payments.PaymentProcessor;

public class BookingApi {
    public boolean completeBooking(double totalAmount, PaymentMode paymentMode, CardDetails cardDetails) {
        if(paymentMode==null || cardDetails==null) {
            throw new IllegalArgumentException("Missing params!");
        }
        if(totalAmount<=0) {
            throw new RuntimeException("total Price calculation error!");
        }

        PaymentProcessor paymentProcessor = PaymentProcessorFactory.getPaymentProcessor(paymentMode, cardDetails, totalAmount);

        return new CompleteBooking().completeBooking(paymentProcessor, totalAmount);
    }
}
