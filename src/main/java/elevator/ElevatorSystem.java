package elevator;

import elevator.algorithm.ElevatorControlStrategy;
import elevator.algorithm.ElevatorSelectionStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ElevatorSystem {
    List<ElevatorController> elevatorControllerList = new ArrayList<>();
    public static ElevatorControlStrategy elevatorControlStrategy;
    public static ElevatorSelectionStrategy elevatorSelectionStrategy;
    public List<Floor> floorList;

    public static ElevatorSystem instace = new ElevatorSystem();

    private ElevatorSystem(){

    }

    public void addElevator(ElevatorController elevatorController){
        elevatorControllerList.add(elevatorController);
    }

    public void removeElevator(ElevatorController elevatorController){
        elevatorControllerList.remove(elevatorController);
    }

    public void addFloors(Floor floor){
        floorList.add(floor);
    }

    public static void setElevatorControlStrategy(ElevatorControlStrategy elevatorControlStrategy) {
        ElevatorSystem.elevatorControlStrategy = elevatorControlStrategy;
    }

    public static void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy) {
        ElevatorSystem.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public List<ElevatorController> getElevatorControllerList() {
        return elevatorControllerList;
    }

    public void setElevatorControllerList(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }
}
