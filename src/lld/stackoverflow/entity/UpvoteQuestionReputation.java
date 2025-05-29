package lld.stackoverflow.entity;

import lld.stackoverflow.enums.REPUTATION_TYPE;

public class UpvoteQuestionReputation implements Reputation{

    @Override
    public REPUTATION_TYPE getType() {
        return REPUTATION_TYPE.UPVOTE_QUESTION;
    }

    @Override
    public int getReputationPoints() {
        return 5;
    }
}
