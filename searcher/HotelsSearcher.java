package lld_case_studies.hotel_booking.searcher;

import lld_case_studies.hotel_booking.dao.DataAccessResult;
import lld_case_studies.hotel_booking.dao.DataAccessor;
import lld_case_studies.hotel_booking.dao.DataObjectConvertor;
import lld_case_studies.hotel_booking.data.Hotel;
import lld_case_studies.hotel_booking.data.Location;
import lld_case_studies.hotel_booking.filters.HotelFilters;

import java.util.ArrayList;
import java.util.List;

public class HotelsSearcher {

    public List<Hotel> searchHotels(Location location, List<HotelFilters>filters, String hotelName) {
        DataAccessResult result = DataAccessor.getHotelsByNameAndLocation(location, hotelName);
        List<Hotel>hotels = DataObjectConvertor.convertToListOfHotels(result);
        if(hotels == null || hotels.isEmpty()) {
            return hotels;
        }
        for(HotelFilters filter:filters) {
            List<Hotel>filteredHotels = new ArrayList<>();
            for(Hotel h: hotels) {
                if(filter.filter(h)) {
                    filteredHotels.add(h);
                }
            }
            hotels=filteredHotels;
        }
        return hotels;
    }
}
