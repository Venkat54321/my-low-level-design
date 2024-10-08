package vendingmachine;

public enum Note {
    TEN(10),
    TWENTY(20),

    FIFTY(50),
    HUNDRED(100);

    private Integer value;

    Note(int value){
        this.value = value;
    }

    public Integer getValue(){
        return value;
    }
}
