package lld_case_studies.hotel_booking.data;

public enum PriceAccordingToRoomType {
    BASIC(100),
    BASIC_DELUXE(150),
    MEDIUM(200),
    MEDIUM_WITH_BALCONY(250),
    FAMILY(300),
    SUITE(350);

    private final double price;
    PriceAccordingToRoomType(double price) {

        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
