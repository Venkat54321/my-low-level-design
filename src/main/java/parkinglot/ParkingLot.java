package parkinglot;

import parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private List<Level> levels = new ArrayList<>();

    public static synchronized ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public void addLevel(Level level) {
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.parkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.unParkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public void displayAvailable() {
        for (Level level : levels) {
            level.availability(level);
        }
    }

}
