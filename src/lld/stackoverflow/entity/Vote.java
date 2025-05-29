package lld.stackoverflow.entity;


import lld.stackoverflow.enums.VOTE_TYPE;

public class Vote {
    private VOTE_TYPE voteType;
    private User votedBy;

    public Vote(VOTE_TYPE voteType, User votedBy) {
        this.voteType = voteType;
        this.votedBy = votedBy;
    }

    public VOTE_TYPE getVoteType() {
        return voteType;
    }

    public User getVotedBy() {
        return votedBy;
    }
}
