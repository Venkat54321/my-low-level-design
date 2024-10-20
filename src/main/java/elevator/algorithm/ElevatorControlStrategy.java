package elevator.algorithm;

import elevator.ElevatorController;
import elevator.ElevatorSystem;
import elevator.Floor;
import elevator.PendingRequests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ElevatorControlStrategy {

    private Queue<PendingRequests> pendingRequests = new LinkedList<>();
    private List<ElevatorController> elevatorControllerList = ElevatorSystem.instace.getElevatorControllerList();

    public void moveElevator(ElevatorController elevatorController){

    }

}
