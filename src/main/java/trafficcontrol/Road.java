package trafficcontrol;

public class Road {
    private Integer id;
    private String name;
    private TrafficLight trafficLight;


    public Road(Integer id, String name, TrafficLight trafficLight) {
        this.id = id;
        this.name = name;
        this.trafficLight = trafficLight;
    }

    public TrafficLight getTrafficLight() {
        return trafficLight;
    }

    public void setTrafficLight(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
