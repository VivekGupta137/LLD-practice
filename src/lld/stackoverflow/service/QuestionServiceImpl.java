package lld.stackoverflow.service;

import lld.stackoverflow.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class QuestionServiceImpl implements QuestionService{

    private static QuestionService instance = null;
    private List<Question> questions;

    private QuestionServiceImpl() {
        questions = new ArrayList<>();
    }

    // lazy singleton
    public static QuestionService getInstance() {
        if(instance == null) {
            instance = new QuestionServiceImpl();
        }
        return instance;
    }

    @Override
    public Optional<Question> getQuestionById(int id) {
        return Optional.ofNullable(questions.stream().filter(q -> q.getId() == id).findFirst().orElse(null));
    }

    @Override
    public Question addQuestion(Question question) {
        // check if a question with same id already exists
        Question existingQuestion = getQuestionById(question.getId()).orElse(null);
        if(existingQuestion != null) {
            throw new RuntimeException("Question with id " + question.getId() + " already exists");
        }

        questions.add(question);
        question.getAuthor().getReputation().updateReputation(new AddQuestionReputation());
        return question;
    }

    @Override
    public List<Question> getAllQuestions() {
        return questions;
    }


    @Override
    public void addVote(Voteable voteable, Vote vote) {
        voteable.getVoteManager().addVote(vote);
        voteable.getAuthor().getReputation().updateReputation(new UpvoteQuestionReputation());
    }


    @Override
    public void addComment(Commentable commentable, Comment comment) {
        commentable.getCommentManager().addComment(comment);
    }
}
