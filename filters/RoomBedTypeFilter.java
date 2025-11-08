package lld_case_studies.hotel_booking.filters;

import lld_case_studies.hotel_booking.data.Room;
import lld_case_studies.hotel_booking.data.RoomBedType;

public class RoomBedTypeFilter implements RoomFilter{

    private final RoomBedType roomBedType;

    public RoomBedTypeFilter(RoomBedType roomBedType) {
        this.roomBedType = roomBedType;
    }

    @Override
    public boolean filter(Room room) {
        return roomBedType.equals(room.getRoomBedType());
    }
}
