package vendingmachine;

public class DisperseState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public DisperseState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        throw new IllegalArgumentException("Product already selected. dispensing product");
    }

    @Override
    public void insertCoin(Coin coin) {
        throw new IllegalArgumentException("Product already selected. dispensing product");
    }

    @Override
    public void insertNote(Note note) {
        throw new IllegalArgumentException("Product already selected. dispensing product");
    }

    @Override
    public void disperseProduct() {
        vendingMachine.getInventory().updateQuantity(vendingMachine.getSelectedProduct(),vendingMachine.getSelectedProduct().getQuantity() - 1);
        vendingMachine.setCurrentState(vendingMachine.getReturnChangeState());
    }

    @Override
    public void returnChangeState() {
        throw new IllegalArgumentException("Product already selected. dispensing product");
    }
}
