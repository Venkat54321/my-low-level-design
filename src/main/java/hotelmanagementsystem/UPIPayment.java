package hotelmanagementsystem;

public class UPIPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid amount " + amount + " through UPI paument");
    }
}
