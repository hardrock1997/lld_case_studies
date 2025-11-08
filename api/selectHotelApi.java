package lld_case_studies.hotel_booking.api;

import lld_case_studies.hotel_booking.data.Hotel;

import java.util.List;

public class selectHotelApi {

    public Hotel selectHotel(List<Hotel>hotels, Hotel selectedHotel) {
        Hotel hotel=null;
        for(Hotel h:hotels) {
            if(h.equals(selectedHotel)) {
                h.setIsSelected(true);
                hotel=h;
            }
            else {
                h.setIsSelected(false);
            }
        }
        return hotel;
    }
}
