package lld_case_studies.hotel_booking.api;

import lld_case_studies.hotel_booking.data.Hotel;
import lld_case_studies.hotel_booking.data.Location;
import lld_case_studies.hotel_booking.data.Room;
import lld_case_studies.hotel_booking.data.RoomType;
import lld_case_studies.hotel_booking.selector.RoomSelector;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class SelectRoomInTheHotelApi {
    public Map<RoomType, Integer> selectRoom(Hotel selectedHotel, Map<RoomType, Integer>userWantedRooms, LocalDateTime checkInDate, LocalDateTime checkoutDate) {
        if(selectedHotel==null || userWantedRooms==null || userWantedRooms.isEmpty()) {
            throw new IllegalArgumentException("Missing params!");
        }
        if(!selectedHotel.isSelected()) {
            throw new IllegalArgumentException("Not the selected Hotel!");
        }
        return new RoomSelector().selectRoom(selectedHotel, userWantedRooms, checkInDate, checkoutDate);
    }
}
