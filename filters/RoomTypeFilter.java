package lld_case_studies.hotel_booking.filters;

import lld_case_studies.hotel_booking.data.Room;
import lld_case_studies.hotel_booking.data.RoomType;

public class RoomTypeFilter implements RoomFilter{

    private final RoomType roomType;

    public RoomTypeFilter(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public boolean filter(Room room) {
        return roomType.equals(room.getRoomType());
    }

}
