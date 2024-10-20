package elevator;

public class ElevatorCar {
    private int id;
    private Door door;
    private Display display;
    private Button button;
    private int currentFloor;
    private Direction direction;

    public ElevatorCar(int id){
        this.id = id;
        this.door = new Door();
        this.display = new Display();
        this.button = new Button();
        this.currentFloor = 0;
        this.direction = Direction.IDEAL;
    }


    public void move(Direction direction,int floor){

        System.out.println("Moving " + direction + " to the floor " + floor);
        door.open(floor);
        door.close(floor);

        setDisplay();
    }

    public void pressButton(int floor){
        Direction direction1 = Direction.IDEAL;
        if(floor > currentFloor){
            direction1 = Direction.UP;
        }else if(floor < currentFloor){
            direction1 = Direction.DOWN;
        }
        button.internalButton(floor,direction1,id);

    }

    private void setDisplay(){
        display.setDirection(direction);
        display.setFloor(currentFloor);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Display getDisplay() {
        return display;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
