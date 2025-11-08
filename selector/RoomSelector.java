package lld_case_studies.hotel_booking.selector;

import lld_case_studies.hotel_booking.dao.DataAccessor;
import lld_case_studies.hotel_booking.data.Hotel;
import lld_case_studies.hotel_booking.data.Room;
import lld_case_studies.hotel_booking.data.RoomType;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RoomSelector {


    private boolean isAvailable(Hotel hotel, Map<RoomType, Integer>userWantedRooms, LocalDateTime checkInDate, LocalDateTime checkoutDate) {
        boolean flag = DataAccessor.isRoomAvailable(hotel,userWantedRooms,checkInDate,checkoutDate);
        if(!flag) {
            return false;
        }
        int roomsBookedCount=0;
        for(Room r:hotel.getRooms()) {
            if(r.isSelected()) {
                roomsBookedCount++;
            }
        }
        if(roomsBookedCount==hotel.getRooms().size()) {
            return false;
        }

        for(RoomType roomType: userWantedRooms.keySet()) {
            int roomsOfThisType=userWantedRooms.get(roomType);
            int nonSelectedRoomsOfThisType=0;
            for(Room r:hotel.getRooms()) {
                if(r.getRoomType().equals(roomType) && !r.isSelected()) {
                    nonSelectedRoomsOfThisType++;
                }
            }
            if(nonSelectedRoomsOfThisType<roomsOfThisType) {
                return false;
            }
        }
        return true;
    }

    public Map<RoomType, Integer> selectRoom(Hotel hotel,  Map<RoomType, Integer>userWantedRooms, LocalDateTime checkInDate, LocalDateTime checkoutDate) {
        Map<RoomType, Integer>selectedRoomDetails=new HashMap<>();
        synchronized (hotel) {
            boolean isAvailable  = this.isAvailable(hotel, userWantedRooms, checkInDate, checkoutDate);
            if(!isAvailable) {
                for(RoomType roomType:userWantedRooms.keySet()) {
                    selectedRoomDetails.put(roomType,0);
                }
                return selectedRoomDetails;
            }
            for(RoomType roomType:userWantedRooms.keySet()) {
                List<Room>rooms=hotel.getRooms();
                int roomsOfThisType=0;
                for(Room r:rooms) {
                    if(r.getRoomType().equals(roomType)) {
                        r.setSelected(true);
                        roomsOfThisType++;
                    }
                }
                selectedRoomDetails.put(roomType, roomsOfThisType);
            }
        }
        return selectedRoomDetails;
    }
}
