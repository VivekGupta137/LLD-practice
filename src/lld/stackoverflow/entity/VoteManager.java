package lld.stackoverflow.entity;

import java.util.ArrayList;
import java.util.List;

public class VoteManager {
    List<Vote> votes;
    Voteable voteable;
    VoteManager(Voteable voteable) {
        this.voteable = voteable;
        votes = new ArrayList<>();
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void addVote(Vote vote) {
        // check if the user has already voted on this question
        for (int i = 0; i < votes.size(); i++) {
            Vote existingVote = votes.get(i);
            if(vote.getVotedBy().getId() == existingVote.getVotedBy().getId()){
                votes.remove(existingVote);
            }
        }
        // add the new vote
        votes.add(vote);
    }

}
