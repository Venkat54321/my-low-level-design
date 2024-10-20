package hotelmanagementsystem;

import taskmanager.User;

import java.time.LocalDateTime;
import java.util.Objects;

public class Room {
    private String roomId;
    private Guest guest;
    private boolean isAvailable;
    private RoomType roomType;
    private double price;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    public Room(String roomID,RoomType roomType, double price) {
        this.roomId = roomID;
        this.roomType = roomType;
        this.price = price;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public boolean isAvailable() {
        return true;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return isAvailable == room.isAvailable && Double.compare(room.price, price) == 0 && Objects.equals(roomId, room.roomId) && Objects.equals(guest, room.guest) && roomType == room.roomType && Objects.equals(checkIn, room.checkIn) && Objects.equals(checkOut, room.checkOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, guest, isAvailable, roomType, price, checkIn, checkOut);
    }
}
