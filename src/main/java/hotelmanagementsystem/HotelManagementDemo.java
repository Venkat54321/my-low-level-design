package hotelmanagementsystem;

import java.time.LocalDateTime;

public class HotelManagementDemo {

    public static void main(String[] args) {
        Guest guest1 = new Guest("1","Venkat","7353058795");
        Guest guest2 = new Guest("2","Venkat-2","7353058795-2");

        Room room1 = new Room("1",RoomType.SINGLE,20.0);
        Room room2 = new Room("2",RoomType.DOUBLE,30.0);
        Room room3 = new Room("3",RoomType.SUIT,40.0);

        HotelManagementSystem instance = HotelManagementSystem.getInstance();

        instance.addRoom(room1);
        instance.addRoom(room2);
        instance.addRoom(room3);

        instance.reserveRoom(guest1,room2,LocalDateTime.now(),LocalDateTime.now().plusDays(2));
        instance.reserveRoom(guest2,room3,LocalDateTime.now(),LocalDateTime.now().plusDays(2));

        instance.getAvailableRooms();

        instance.cancelRoom(guest1,room2);

        instance.getAvailableRooms();
    }
}
