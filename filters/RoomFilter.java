package lld_case_studies.hotel_booking.filters;

import lld_case_studies.hotel_booking.data.Room;

public interface RoomFilter {
    public boolean filter(Room room);
}
