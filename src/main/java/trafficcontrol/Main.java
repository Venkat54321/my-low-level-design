package trafficcontrol;

public class Main {
    public static void main(String[] args) {
        TrafficController trafficController = TrafficController.getInstance();

        // traffic light
        TrafficLight trafficLight1 = new TrafficLight(1,6000,5000,6000);
        TrafficLight trafficLight2 = new TrafficLight(1,6000,5000,6000);
        TrafficLight trafficLight3 = new TrafficLight(1,6000,5000,60000);
        TrafficLight trafficLight4 = new TrafficLight(1,6000,5000,6000);

        trafficController.addRoad(new Road(1,"X",trafficLight1));
        trafficController.addRoad(new Road(2,"Y",trafficLight2));
        trafficController.addRoad(new Road(3,"Z",trafficLight3));
        trafficController.addRoad(new Road(4,"A",trafficLight4));

        trafficController.controlTrafficSignal();

    }
}
