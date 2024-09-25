package vendingmachine;

public interface VendingMachineState {

    void selectProduct(Product product);

    void insertCoin(Coin coin);

    void  insertNote(Note note);

    void disperseProduct();

    void returnChangeState();
}
