package carrentalsystem;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class CarRentalSystem {

    private static CarRentalSystem instance;

    // carId,reservation
    private Map<String,Reservation> reservationMap;
    private List<Car> carList;

    public synchronized static CarRentalSystem getInstance(){
        if(instance == null){
            instance = new CarRentalSystem();
        }
        return instance;
    }

    public void addCar(Car car){
        carList.add(car);
    }

    public Reservation createReservation(Customer customer, Car car, LocalDateTime startDate,LocalDateTime endDate, Double totalAmount){
        Reservation reservation = new Reservation(UUID.randomUUID().toString(),customer,startDate,endDate,totalAmount);
        if(!reservationMap.containsKey(reservation.getReservationId())){
            reservationMap.put(reservation.getReservationId(),reservation);
            car.setAvailable(false);
            return reservation;
        }
        return null;
    }

    public void modifyReservation(){

    }

    public void deleteReservation(){

    }

}
