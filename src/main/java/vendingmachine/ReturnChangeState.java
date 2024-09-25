package vendingmachine;

public class ReturnChangeState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public ReturnChangeState(VendingMachine vendingMachine){
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
        throw new IllegalArgumentException("Product already selected. dispensing product");
    }

    @Override
    public void returnChangeState() {
        Integer change = vendingMachine.getTotalAmount() - vendingMachine.getSelectedProduct().getPrice();
        if(change > 0){
            System.out.println("Return change.." + change);
        }else {
            System.out.println("No change required.");
        }
        vendingMachine.reset();
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }
}
