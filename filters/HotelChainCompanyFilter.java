package lld_case_studies.hotel_booking.filters;

import lld_case_studies.hotel_booking.data.Hotel;
import lld_case_studies.hotel_booking.data.HotelChainCompany;

public class HotelChainCompanyFilter implements HotelFilters{

    private final HotelChainCompany hotelChainCompany;

    public HotelChainCompanyFilter(HotelChainCompany hotelChainCompany) {
        this.hotelChainCompany = hotelChainCompany;
    }

    @Override
    public boolean filter(Hotel hotel) {
        return false;
    }
}
