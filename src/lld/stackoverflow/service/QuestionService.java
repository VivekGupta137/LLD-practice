package lld.stackoverflow.service;

import lld.stackoverflow.entity.Question;
import lld.stackoverflow.entity.User;
import lld.stackoverflow.entity.Vote;

import java.util.List;
import java.util.Optional;

public interface QuestionService extends VoteService, CommentService{
    public Optional<Question> getQuestionById(int id);
    public Question addQuestion(Question question);
    public List<Question> getAllQuestions();
}
