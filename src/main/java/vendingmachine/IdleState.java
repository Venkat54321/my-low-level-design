package vendingmachine;

public class IdleState implements VendingMachineState{

    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        if(vendingMachine.getInventory().isAvailable(product)){
            vendingMachine.setSelectedProduct(product);
            vendingMachine.setCurrentState(vendingMachine.getReadyState());
            System.out.println("product selected is " + product.getName());
        }else {
            System.out.println("product is " + product.getName() + " is not available.");
        }
    }

    @Override
    public void insertCoin(Coin coin) {
        throw new IllegalArgumentException("First select product..");
    }

    @Override
    public void insertNote(Note note) {
        throw new IllegalArgumentException("First select product..");
    }

    @Override
    public void disperseProduct() {
        throw new IllegalArgumentException("First select product..");
    }

    @Override
    public void returnChangeState() {
        throw new IllegalArgumentException("First select product..");
    }
}
