package parkinglot.vehicle;

public class Car extends Vehicle{

    private String vehicleNumber;

    public Car(String vehicleNumber){
        super(vehicleNumber,VehicleType.CAR);
    }
}
