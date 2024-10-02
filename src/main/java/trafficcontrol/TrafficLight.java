package trafficcontrol;

public class TrafficLight {
    private Integer id;
    private Signal currentSignal;
    private int reLightDuration;
    private int yellowLightDuration;
    private int greenLightDuration;

    public TrafficLight(Integer id, int reLightDuration, int yellowLightDuration, int greenLightDuration) {
        this.id = id;
        this.currentSignal = Signal.RED;
        this.reLightDuration = reLightDuration;
        this.yellowLightDuration = yellowLightDuration;
        this.greenLightDuration = greenLightDuration;
    }

    public synchronized void changeSignal(Signal newSignal){
        currentSignal = newSignal;
    }

    public int getReLightDuration() {
        return reLightDuration;
    }

    public void setReLightDuration(int reLightDuration) {
        this.reLightDuration = reLightDuration;
    }

    public int getYellowLightDuration() {
        return yellowLightDuration;
    }

    public void setYellowLightDuration(int yellowLightDuration) {
        this.yellowLightDuration = yellowLightDuration;
    }

    public int getGreenLightDuration() {
        return greenLightDuration;
    }

    public void setGreenLightDuration(int greenLightDuration) {
        this.greenLightDuration = greenLightDuration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Signal getCurrentSignal() {
        return currentSignal;
    }

    public void setCurrentSignal(Signal currentSignal) {
        this.currentSignal = currentSignal;
    }
}
