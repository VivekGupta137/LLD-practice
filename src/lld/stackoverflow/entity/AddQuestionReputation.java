package lld.stackoverflow.entity;

import lld.stackoverflow.enums.REPUTATION_TYPE;

public class AddQuestionReputation implements Reputation{
    @Override
    public REPUTATION_TYPE getType() {
        return REPUTATION_TYPE.QUESTION;
    }

    @Override
    public int getReputationPoints() {
        return 10;
    }

}
