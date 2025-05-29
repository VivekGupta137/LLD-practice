package lld.stackoverflow.service;

import lld.stackoverflow.entity.Vote;
import lld.stackoverflow.entity.Voteable;

public interface VoteService {
    void addVote(Voteable voteable, Vote vote);
}
