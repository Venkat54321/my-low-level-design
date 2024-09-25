package vendingmachine;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();
        Inventory inventory = vendingMachine.getInventory();
        inventory.addProduct(new Product("cock",10,10));
        inventory.addProduct(new Product("pepsi",10,10));
        vendingMachine.setInventory(inventory);

        vendingMachine.selectProduct(new Product("cock",10,10));

        vendingMachine.insertNote(Note.TWENTY);

        vendingMachine.dispenseProduct();

        vendingMachine.returnChange();

    }
}
