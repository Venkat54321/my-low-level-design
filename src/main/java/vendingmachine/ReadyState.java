package vendingmachine;

public class ReadyState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        throw new IllegalArgumentException("Product already selected. please insert Coin or not....");
    }

    @Override
    public void insertCoin(Coin coin) {
        vendingMachine.addCoin(coin);
        checkPaymentStatus();
    }

    @Override
    public void insertNote(Note note) {
        vendingMachine.addNote(note);
        checkPaymentStatus();
    }

    @Override
    public void disperseProduct() {
        throw new IllegalArgumentException("Product already selected. please insert Coin or not....");
    }

    @Override
    public void returnChangeState() {
        throw new IllegalArgumentException("Product already selected. please insert Coin or not....");
    }

    private void checkPaymentStatus(){
        if(vendingMachine.getTotalAmount() >= vendingMachine.getSelectedProduct().getPrice()){
            vendingMachine.setCurrentState(vendingMachine.getDispenseState());
        }
    }
}
