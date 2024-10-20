package hotelmanagementsystem;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Reservation {

    Map<String,Room> bookedRooms;

    public Reservation(){
        bookedRooms = new ConcurrentHashMap<>();
    }

    public boolean bookRoom(Guest guest, Room room, LocalDateTime checkIn, LocalDateTime checkout){
        if(bookedRooms.containsKey(room.getRoomId())){
            System.out.println("Room already booked. please choose some other room..");
            return false;
        }else{
            room.setGuest(guest);
            room.setCheckIn(checkIn);
            room.setCheckOut(checkout);
            room.setAvailable(false);
            bookedRooms.put(room.getRoomId(),room);
            System.out.println("Room for guest " + guest.getName() + " Booked successfully");
            return true;
        }
    }

    public boolean cancelBooking(Guest guest, Room room) {
        if(bookedRooms.containsKey(room.getRoomId())){
            bookedRooms.remove(room.getRoomId());
            System.out.println("Room " + room.getRoomType().name() + " cancelled by " + guest.getName());
            return true;
        }
        return false;
    }
}
