package lld_case_studies.hotel_booking.booking;

import lld_case_studies.hotel_booking.payments.PaymentProcessor;

public class CompleteBooking {
    public boolean completeBooking(PaymentProcessor paymentProcessor, double totalAmount) {
        return true;
    }
}


//“This method would be responsible for completing the booking transaction.
//It would delegate the payment step to the PaymentProcessor, verify the result, and then persist booking details — such as the hotel, room, and user info — in a repository or database.
//If the payment fails, it would roll back the booking or mark it as failed.”