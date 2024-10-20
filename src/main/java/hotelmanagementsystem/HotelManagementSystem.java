package hotelmanagementsystem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelManagementSystem {

    private static HotelManagementSystem instance;
    List<Room> availableRooms;
    Reservation reservation;
    Payment payment;

    private HotelManagementSystem(){
        availableRooms = new ArrayList<>();
        reservation = new Reservation();
        payment = new UPIPayment();
    }

    public synchronized static HotelManagementSystem getInstance(){
        if(instance == null){
            instance = new HotelManagementSystem();
        }
        return instance;
    }

    public void addRoom(Room room){
        availableRooms.add(room);
    }

    public synchronized void reserveRoom(Guest guest, Room room, LocalDateTime checkIn, LocalDateTime checkOut){
         if(reservation.bookRoom(guest,room,checkIn,checkOut)){
             double amount = room.getPrice() * Duration.between(checkIn,checkOut).toDays();
             processPayment(amount);
             availableRooms.remove(room);
         }
    }

    public synchronized void cancelRoom(Guest guest, Room room){
        if(reservation.cancelBooking(guest,room)){
            availableRooms.add(room);
        }
    }

    public synchronized void getAvailableRooms(){
       List<Room> roomList = availableRooms.stream().filter(Room::isAvailable).collect(Collectors.toList());
        for(Room room : roomList){
            System.out.println(room.getRoomId() + " " + room.getRoomType() + " is available");
        }
    }

    private void processPayment(double amount) {
        Payment payment1 = new UPIPayment();
        payment1.pay(amount);
    }

    public Reservation getReservation() {
        return reservation;
    }
}
