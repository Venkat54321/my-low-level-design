package carrentalsystem;

public class Customer {
    private String customerId;
    private String name;
    private String licenceNumber;

    public Customer(String customerId, String name, String licenceNumber) {
        this.customerId = customerId;
        this.name = name;
        this.licenceNumber = licenceNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
}
