package lld.stackoverflow.entity;

import java.util.List;

public interface Voteable {
    VoteManager getVoteManager();
    User getAuthor();
}
