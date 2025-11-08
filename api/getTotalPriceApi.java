package lld_case_studies.hotel_booking.api;

import lld_case_studies.hotel_booking.data.Hotel;
import lld_case_studies.hotel_booking.data.RoomType;
import lld_case_studies.hotel_booking.price_calulator.PriceCalculator;

import java.util.Map;

public class getTotalPriceApi {
    public double calculateTotalPrice(Map<RoomType, Integer> userSelectedRooms, Hotel selectedHotel) {
        if(userSelectedRooms==null || selectedHotel==null || userSelectedRooms.isEmpty()) {
            throw new IllegalArgumentException("Missing params!");
        }
        return new PriceCalculator().calculatePrice(userSelectedRooms, selectedHotel);
    }
}
