package hotelmanagementsystem;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid amount " + amount + " through credit card");
    }
}
