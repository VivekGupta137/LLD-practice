package lld.stackoverflow.entity;

import java.util.List;

public class Answer implements Voteable, Commentable {
    private int id;
    private boolean accepted = false;
    private User author;
    private Question question;
    private VoteManager voteManager;
    private CommentManager commentManager;

    public Answer(int id, User author, Question question) {
        this.id = id;
        this.author = author;
        this.question = question;
        this.commentManager = new CommentManager(this);
        this.voteManager = new VoteManager(this);
    }

    public int getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public Question getQuestion() {
        return question;
    }

    @Override
    public CommentManager getCommentManager() {
        return commentManager;
    }

    @Override
    public VoteManager getVoteManager() {
        return voteManager;
    }

}
