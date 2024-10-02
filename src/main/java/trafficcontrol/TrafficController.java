package trafficcontrol;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrafficController {

    private static TrafficController trafficController;

    private Map<Integer,Road> roads;

    private TrafficController(){
        roads = new HashMap<>();
    }

    public static TrafficController getInstance(){
        if(trafficController == null){
            trafficController = new TrafficController();
        }
        return trafficController;
    }

    public void addRoad(Road road){
        roads.put(road.getId(),road);
    }

    public void controlTrafficSignal(){
        for(Road road : roads.values()){
            TrafficLight trafficLight= road.getTrafficLight();
            new Thread(() -> {
                while (true){
                    try {
                        System.out.println("Waiting for " + trafficLight.getReLightDuration() + " " + trafficLight.getCurrentSignal().name());
                        Thread.sleep(trafficLight.getReLightDuration());
                        trafficLight.changeSignal(Signal.GREEN);
                        System.out.println("Waiting for " + trafficLight.getGreenLightDuration() + " " + trafficLight.getCurrentSignal().name());
                        Thread.sleep(trafficLight.getGreenLightDuration());
                        trafficLight.changeSignal(Signal.YELLOW);
                        System.out.println("Waiting for " + trafficLight.getYellowLightDuration() + " " + trafficLight.getCurrentSignal().name());
                        Thread.sleep(trafficLight.getYellowLightDuration());
                        trafficLight.changeSignal(Signal.RED);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
    }
}
