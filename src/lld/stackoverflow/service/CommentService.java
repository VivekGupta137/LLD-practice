package lld.stackoverflow.service;

import lld.stackoverflow.entity.Comment;
import lld.stackoverflow.entity.Commentable;

public interface CommentService {
    public void addComment(Commentable commentable, Comment comment);
}
