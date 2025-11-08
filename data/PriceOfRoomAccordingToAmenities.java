package lld_case_studies.hotel_booking.data;

public enum PriceOfRoomAccordingToAmenities {
    EXTRA_BEDDING_PRICE(100),
    MINI_BAR_PRICE(50);

    private final int price;

    PriceOfRoomAccordingToAmenities(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
