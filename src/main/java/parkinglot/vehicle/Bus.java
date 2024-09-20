package parkinglot.vehicle;

public class Bus extends Vehicle{
    private String vehicleNumber;
    public Bus(String vehicleNumber){
        super(vehicleNumber,VehicleType.BUS);
    }
}
