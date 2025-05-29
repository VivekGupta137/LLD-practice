package lld.stackoverflow.entity;

import java.util.List;

public class Comment  {
    private int id;
    private User commentedBy;

    public Comment(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public User getCommentedBy() {
        return commentedBy;
    }
}
