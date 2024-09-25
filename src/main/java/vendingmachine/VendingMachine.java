package vendingmachine;

public class VendingMachine {
    private static VendingMachine vendingMachine;
    private Inventory inventory;
    private VendingMachineState idleState;
    private VendingMachineState readyState;
    private VendingMachineState dispenseState;
    private VendingMachineState returnChangeState;
    private VendingMachineState currentState;
    private Product selectedProduct;
    private Integer totalAmount;

    public VendingMachine() {
        inventory = new Inventory();
        selectedProduct = null;
        totalAmount = 0;
        idleState = new IdleState(this);
        currentState = idleState;
        readyState = new ReadyState(this);
        dispenseState = new DisperseState(this);
        returnChangeState = new ReturnChangeState(this);
    }

    public static VendingMachine getInstance(){
        if(vendingMachine == null){
            vendingMachine = new VendingMachine();
        }
        return vendingMachine;
    }

    public void reset(){
        totalAmount = 0;
        selectedProduct = null;
    }

    public void selectProduct(Product product){
        currentState.selectProduct(product);
    }

    public void insertNote(Note note){
        currentState.insertNote(note);
    }

    public void addCoin(Coin coin){
        totalAmount = totalAmount + coin.getValue();
    }

    public void addNote(Note note){
        totalAmount = totalAmount + note.getValue();
    }

    public VendingMachineState getIdleState() {
        return idleState;
    }

    public void setIdleState(VendingMachineState idleState) {
        this.idleState = idleState;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public VendingMachineState getReadyState() {
        return readyState;
    }

    public void setReadyState(VendingMachineState readyState) {
        this.readyState = readyState;
    }

    public VendingMachineState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(VendingMachineState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public VendingMachineState getReturnChangeState() {
        return returnChangeState;
    }

    public void setReturnChangeState(VendingMachineState returnChangeState) {
        this.returnChangeState = returnChangeState;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void dispenseProduct(){
        currentState.disperseProduct();
    }

    public void returnChange(){
        currentState.returnChangeState();
    }
}
