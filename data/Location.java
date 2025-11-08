package lld_case_studies.hotel_booking.data;

public class Location {

    private final String cityName;
    private final String stateName;
    private final String countryName;

    public Location(String cityName, String stateName, String countryName) {
        this.cityName = cityName;
        this.stateName = stateName;
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public String getCountryName() {
        return countryName;
    }
}