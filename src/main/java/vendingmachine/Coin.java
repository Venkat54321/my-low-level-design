package vendingmachine;

public enum Coin {
    ONE(1),
    FIVE(5),
    TEN(10);

    private Integer value;
    Coin(int value){
        this.value = value;
    }

    public Integer getValue(){
        return value;
    }
}
