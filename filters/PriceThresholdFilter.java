package lld_case_studies.hotel_booking.filters;

import lld_case_studies.hotel_booking.data.Hotel;
import lld_case_studies.hotel_booking.data.PriceThreshold;

public class PriceThresholdFilter implements HotelFilters{

    private final PriceThreshold priceThreshold;

    public PriceThresholdFilter(PriceThreshold priceThreshold) {
        this.priceThreshold = priceThreshold;
    }

    @Override
    public boolean filter(Hotel hotel) {
        return priceThreshold.equals(hotel.getPriceThreshold());
    }
}
