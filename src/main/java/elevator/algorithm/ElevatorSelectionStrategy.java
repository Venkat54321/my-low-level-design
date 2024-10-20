package elevator.algorithm;

import elevator.Direction;
import elevator.ElevatorController;
import elevator.ElevatorSystem;

import java.util.List;

public class ElevatorSelectionStrategy {

    private List<ElevatorController> elevatorControllerList = ElevatorSystem.instace.getElevatorControllerList();

    public int selectElevator(int floor, Direction direction){
       return 0;
    }
}
