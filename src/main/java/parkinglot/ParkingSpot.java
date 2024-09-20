package parkinglot;

import parkinglot.vehicle.Vehicle;
import parkinglot.vehicle.VehicleType;

public class ParkingSpot {
    private Integer spotNumber;
    private Vehicle parkedVehicle;
    private VehicleType vehicleType;

    public ParkingSpot(Integer spotNumber, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }

    public boolean isAvailable(){
       return parkedVehicle == null;
    }

    public boolean parkVehicle(Vehicle vehicle){
        if(isAvailable() && vehicle.getVehicleType() == vehicleType){
            parkedVehicle = vehicle;
            return true;
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle){
        if(!isAvailable() && vehicle.getVehicleType() == vehicleType){
            parkedVehicle = null;
            return true;
        }
        return false;
    }

    public Integer getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(Integer spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Vehicle getVehicle() {
        return parkedVehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
