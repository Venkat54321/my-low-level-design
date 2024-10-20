package carrentalsystem;

public class Car {
    private String carId;
    private String carName;
    private String model;
    private String rcPlateNumber;
    private boolean isAvailable;
    private Double pricePerDay;

    public Car(String carId, String carName, String model, String rcPlateNumber, boolean isAvailable,Double pricePerDay) {
        this.carId = carId;
        this.carName = carName;
        this.model = model;
        this.rcPlateNumber = rcPlateNumber;
        this.isAvailable = isAvailable;
        this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRcPlateNumber() {
        return rcPlateNumber;
    }

    public void setRcPlateNumber(String rcPlateNumber) {
        this.rcPlateNumber = rcPlateNumber;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
