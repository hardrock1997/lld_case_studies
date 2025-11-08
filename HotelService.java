package lld_case_studies.hotel_booking;
import lld_case_studies.hotel_booking.dao.DataAccessor;
import lld_case_studies.hotel_booking.data.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HotelService {

    public Hotel addHotel(Location location, String name, UserToken userToken, Map<RoomType, Integer>roomDetails, RoomBedType roomBedType) {
        boolean exist = DataAccessor.doesExist(location, name);
        if(exist) {
            throw new RuntimeException("hotel with the same name and in the location already exists!");
        }
        int hotelId=0; //logic for generating the unique hotel id
        List<Room>rooms= new ArrayList<>();
        for(RoomType roomType:roomDetails.keySet()) {
            int roomsOfThisType = roomDetails.getOrDefault(roomType,0);
            while(roomsOfThisType>0) {
                Room r = new Room(roomType.toString());
                if(roomBedType!=null) {
                    r.setRoomBedType(roomBedType);
                }
                rooms.add(r);
                roomsOfThisType--;
            }
        }

        Hotel newHotel = new Hotel(name, location, hotelId, rooms);
        DataAccessor.addHotel(location, newHotel); //hotel added in the DB
        return newHotel;
    }
}
