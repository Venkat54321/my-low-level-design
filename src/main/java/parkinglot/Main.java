package parkinglot;

import parkinglot.vehicle.Bike;
import parkinglot.vehicle.Bus;
import parkinglot.vehicle.Car;
import parkinglot.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        parkingLot.addLevel(new Level(1,20));
        parkingLot.addLevel(new Level(2,10));

        Vehicle bike = new Bike("123");
        Vehicle car = new Car("12");
        Vehicle bus = new Bus("1");

        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bus);

        parkingLot.displayAvailable();

        parkingLot.unParkVehicle(bike);
        parkingLot.unParkVehicle(car);
        parkingLot.unParkVehicle(bus);

        parkingLot.displayAvailable();
    }
}
