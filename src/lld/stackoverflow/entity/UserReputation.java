package lld.stackoverflow.entity;

public class UserReputation {
    private int score;
    private int BASE_REPUTATION = 0;
    public UserReputation() {
        this.score = BASE_REPUTATION;
    }

    public int getScore() {
        return score;
    }

    public void updateReputation(Reputation reputation){
        this.score += reputation.getReputationPoints();
    }
}
