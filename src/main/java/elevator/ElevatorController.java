package elevator;

public class ElevatorController {

    private int id;
    private ElevatorCar elevatorCar;

    public ElevatorController(int id){
        this.id = id;
        this.elevatorCar = new ElevatorCar(id);
    }

    public void acceptRequest(int floor, Direction direction){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void setElevatorCar(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }
}
