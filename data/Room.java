package lld_case_studies.hotel_booking.data;

public class Room {

    private final String name;
    private  RoomType roomType;
    private  int maxOccupancy;
    private boolean wifi;
    private boolean extraBedding;
    private boolean roomService;
    private boolean miniBar;
    private  RoomBedType roomBedType;
    private boolean isSelected;


    public Room(String name) {
        this.name = name;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public boolean isWifi() {
        return wifi;
    }

    public String getName() {
        return name;
    }

    public boolean isExtraBedding() {
        return extraBedding;
    }

    public boolean isRoomService() {
        return roomService;
    }

    public boolean isMiniBar() {
        return miniBar;
    }

    public RoomBedType getRoomBedType() {
        return roomBedType;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setExtraBedding(boolean extraBedding) {
        this.extraBedding = extraBedding;
    }

    public void setRoomService(boolean roomService) {
        this.roomService = roomService;
    }

    public void setMiniBar(boolean miniBar) {
        this.miniBar = miniBar;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public void setRoomBedType(RoomBedType roomBedType) {
        this.roomBedType = roomBedType;
    }
}
