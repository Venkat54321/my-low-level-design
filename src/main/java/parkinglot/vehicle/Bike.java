package parkinglot.vehicle;

public class Bike extends Vehicle{
    private String vehicleNumber;
    public Bike(String vehicleNumber){
        super(vehicleNumber,VehicleType.BIKE);
    }
}
