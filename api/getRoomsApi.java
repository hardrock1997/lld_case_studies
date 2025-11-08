package lld_case_studies.hotel_booking.api;

import lld_case_studies.hotel_booking.data.Hotel;
import lld_case_studies.hotel_booking.data.Room;
import lld_case_studies.hotel_booking.data.RoomBedType;
import lld_case_studies.hotel_booking.data.RoomType;
import lld_case_studies.hotel_booking.filters.RoomBedTypeFilter;
import lld_case_studies.hotel_booking.filters.RoomFilter;
import lld_case_studies.hotel_booking.filters.RoomTypeFilter;
import lld_case_studies.hotel_booking.searcher.RoomsSearcher;

import java.util.ArrayList;
import java.util.List;

public class getRoomsApi {
    public List<Room> getRoomsInTheHotel(Hotel hotel, RoomType roomType, RoomBedType roomBedType) {
        //null checks
        List<RoomFilter>roomFilters=new ArrayList<>();
        if(roomType!=null) {
            roomFilters.add(new RoomTypeFilter(roomType));
        }
        if(roomBedType!=null) {
            roomFilters.add(new RoomBedTypeFilter(roomBedType));
        }

        return new RoomsSearcher().searchRooms(hotel, roomFilters);
    }
}
