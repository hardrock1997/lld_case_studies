package lld_case_studies.hotel_booking.api;

import lld_case_studies.hotel_booking.HotelService;
import lld_case_studies.hotel_booking.data.*;
import lld_case_studies.hotel_booking.filters.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class readyTheHotelApi {
    public Hotel readyTheHotels(Location location, String hotelName, UserToken userToken, StarRating starRating, PriceThreshold priceThreshold, HotelChainCompany hotelChainCompany, Map<RoomType, Integer>roomDetails, RoomBedType roomBedType) {
        if(location==null || hotelName==null || userToken==null) {
            throw new IllegalArgumentException("Missing params!");
        }
        if(userToken!= UserToken.HOTEL_ADMIN) {
            throw new RuntimeException("User need to be the hotel admin for this operation!");
        }


        return new HotelService().addHotel(location, hotelName, userToken, roomDetails, roomBedType);
    }
}
