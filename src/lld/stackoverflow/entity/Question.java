package lld.stackoverflow.entity;

import java.util.ArrayList;
import java.util.List;

public class Question implements Voteable, Commentable{
    private int id;
    private User author;
    private VoteManager voteManager;
    private CommentManager commentManager;

    public Question(int id, User author) {
        this.id = id;
        this.author = author;
        voteManager = new VoteManager(this);
        commentManager = new CommentManager(this);
    }

    public int getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    @Override
    public VoteManager getVoteManager() {
        return voteManager;
    }



    @Override
    public CommentManager getCommentManager() {
        return commentManager;
    }

}
