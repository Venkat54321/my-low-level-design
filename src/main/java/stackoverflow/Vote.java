package stackoverflow;

public class Vote {
    private User user;
    private Integer value;

    public Vote(User user, Integer value) {
        this.user = user;
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
