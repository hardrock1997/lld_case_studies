package lld_case_studies.hotel_booking.filters;

import lld_case_studies.hotel_booking.data.Hotel;
import lld_case_studies.hotel_booking.data.StarRating;

public class StarRatingFilter implements HotelFilters{

    private final StarRating starRating;

    public StarRatingFilter(StarRating starRating) {
        this.starRating = starRating;
    }

    @Override
    public boolean filter(Hotel hotel) {
        return starRating.equals(hotel.getStarRating());
    }
}
