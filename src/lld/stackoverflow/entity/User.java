package lld.stackoverflow.entity;

public class User {
    private int id;
    private UserReputation reputation;

    public User(int id) {
        this.id = id;
        this.reputation = new UserReputation();
    }

    public int getId() {
        return id;
    }

    public UserReputation getReputation() {
        return reputation;
    }
}
