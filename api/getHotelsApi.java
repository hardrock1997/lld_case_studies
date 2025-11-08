package lld_case_studies.hotel_booking.api;

import lld_case_studies.hotel_booking.data.*;
import lld_case_studies.hotel_booking.filters.*;
import lld_case_studies.hotel_booking.searcher.HotelsSearcher;

import java.util.ArrayList;
import java.util.List;

public class getHotelsApi {
    public List<Hotel> findHotels(Location location, StarRating starRating, PriceThreshold priceThreshold, HotelChainCompany hotelChainCompany, String hotelName, RoomType roomType, RoomBedType roomBedType) {
        if(location==null || hotelName==null || hotelName.isEmpty()) {
            throw new IllegalArgumentException("Missing params!");
        }
        List<HotelFilters>filters=new ArrayList<>();
        if(starRating!=null) {
            filters.add(new StarRatingFilter(starRating));
        }
        if(priceThreshold!=null) {
            filters.add(new PriceThresholdFilter(priceThreshold));
        }
        if(hotelChainCompany!=null) {
            filters.add(new HotelChainCompanyFilter(hotelChainCompany));
        }

        return new HotelsSearcher().searchHotels(location, filters, hotelName);
    }
}

