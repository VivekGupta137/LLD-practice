package lld.stackoverflow.service;

import lld.stackoverflow.entity.Answer;
import lld.stackoverflow.entity.Commentable;
import lld.stackoverflow.entity.User;
import lld.stackoverflow.entity.Voteable;

import java.util.List;

public interface AnswerService extends VoteService, CommentService {
    public Answer addAnswer(Answer answer);
    public List<Answer> getAnswersByQuestionId(int questionId);
    public Answer getAnswerById(int answerId);
}
