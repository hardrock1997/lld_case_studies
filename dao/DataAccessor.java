package lld_case_studies.hotel_booking.dao;

import lld_case_studies.hotel_booking.data.Hotel;
import lld_case_studies.hotel_booking.data.Location;
import lld_case_studies.hotel_booking.data.Room;
import lld_case_studies.hotel_booking.data.RoomType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class DataAccessor {
    private DataAccessor(){};


    public static DataAccessResult getHotelsByNameAndLocation(Location location, String hotelName) {
        return null;
    }
    public static boolean doesExist(Location location, String hotelName) {
        return false;
    }

    public static boolean isRoomAvailable(Hotel hotel, Map<RoomType, Integer> userWantedRooms, LocalDateTime checkIn, LocalDateTime checkOut) {
        return false;
    }
    public static void addHotel(Location location, Hotel hotel) {

    }
}
