package lld_case_studies.hotel_booking.payments;

public class CashPaymentProcessor implements PaymentProcessor{
    private final double amount;

    public CashPaymentProcessor(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean executePayment() {
        return false;
    }
}
