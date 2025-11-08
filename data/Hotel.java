package lld_case_studies.hotel_booking.data;

import java.util.ArrayList;
import java.util.List;

public class Hotel {


    private final String name;
    private final Location location;
    private final int id;
    private boolean isSelected;
    private  StarRating starRating;
    private  PriceThreshold priceThreshold;
    private  HotelChainCompany hotelChainCompany;
    private List<Room> rooms;

    public Hotel(String name, Location location, int id, List<Room>rooms) {
        this.name = name;
        this.location = location;
        this.id = id;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public PriceThreshold getPriceThreshold() {
        return priceThreshold;
    }

    public HotelChainCompany getHotelChainCompany() {
        return hotelChainCompany;
    }

    public void setIsSelected(boolean flag) {
        this.isSelected=flag;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setStarRating(StarRating starRating) {
        this.starRating = starRating;
    }

    public void setPriceThreshold(PriceThreshold priceThreshold) {
        this.priceThreshold = priceThreshold;
    }

    public void setHotelChainCompany(HotelChainCompany hotelChainCompany) {
        this.hotelChainCompany = hotelChainCompany;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

}
