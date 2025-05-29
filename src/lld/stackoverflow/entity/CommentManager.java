package lld.stackoverflow.entity;

import java.util.ArrayList;
import java.util.List;

public class CommentManager {
    List<Comment> comments;
    Commentable commentable;
    CommentManager(Commentable commentable) {
        this.commentable = commentable;
        comments = new ArrayList<>();
    }

    public void addComment(Comment Comment) {
        // check if the user has already Comment on this question
        for (int i = 0; i < comments.size(); i++) {
            Comment existingComment = comments.get(i);
            if(Comment.getCommentedBy().getId() == existingComment.getCommentedBy().getId()){
                comments.remove(existingComment);
            }
        }
        // add the new Comment
        comments.add(Comment);
    }
}
