package parkinglot;

import parkinglot.ParkingSpot;
import parkinglot.vehicle.Vehicle;
import parkinglot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private int floor;
    private List<ParkingSpot> parkingSpots;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Level(int floor, int numOfSpots){
        this.floor = floor;
        parkingSpots = new ArrayList<>(numOfSpots);
        // 50 : 40 : 10
        int numOfBikeSpot = (int) (numOfSpots * 0.50);
        int numOfCarSpot = (int) (numOfSpots * 0.40);

        for(int i = 1; i <= numOfBikeSpot;i++){
            parkingSpots.add(new ParkingSpot(i, VehicleType.BIKE));
        }

        for(int i = numOfBikeSpot + 1; i <= numOfBikeSpot +  numOfCarSpot; i++){
            parkingSpots.add(new ParkingSpot(i,VehicleType.CAR));
        }

        for(int i = numOfBikeSpot + numOfCarSpot + 1;i <= numOfSpots;i++){
            parkingSpots.add(new ParkingSpot(i,VehicleType.BUS));
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpots){
            if(spot.isAvailable() && vehicle.getVehicleType() == spot.getVehicleType()){
                spot.parkVehicle(vehicle);
                System.out.println("Vehicle " + vehicle.getVehicleType().name() + "  Parked Successfully. ");
                return true;
            }
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpots){
            if(!spot.isAvailable() && vehicle.getVehicleType() == spot.getVehicleType()){
                spot.unParkVehicle(vehicle);
                System.out.println("Vehicle " + vehicle.getVehicleType().name() + " Un Parked Successfully. ");
                return true;
            }
        }
        return false;
    }

    public void availability(Level level){
        for(ParkingSpot spot : parkingSpots){
            if(spot.isAvailable()){
                System.out.println(" Spot : " + spot.getSpotNumber() + " floor " + level.getFloor() + " Available for the vehicle " + spot.getVehicleType());
            }
        }
    }
}
