package lld.stackoverflow.service;

import lld.stackoverflow.entity.*;

import java.util.ArrayList;
import java.util.List;

public class AnswerServiceImpl implements AnswerService{
    List<Answer> answers;

    // eager singleton
    public static AnswerService instance = new AnswerServiceImpl();

    private AnswerServiceImpl() {
        answers = new ArrayList<>();
    }

    public static AnswerService getInstance() {
        return instance;
    }
    @Override
    public Answer addAnswer(Answer answer) {
        answers.add(answer);
        return answer;
    }

    @Override
    public List<Answer> getAnswersByQuestionId(int questionId) {
        return answers.stream().filter(a -> a.getQuestion().getId() == questionId).toList();
    }

    @Override
    public Answer getAnswerById(int answerId) {
        return answers.stream().filter(a -> a.getId() == answerId).findFirst().orElse(null);
    }

    @Override
    public void addComment(Commentable commentable, Comment comment) {
        commentable.getCommentManager().addComment(comment);
    }

    @Override
    public void addVote(Voteable voteable, Vote vote) {
        voteable.getVoteManager().addVote(vote);
    }
}
