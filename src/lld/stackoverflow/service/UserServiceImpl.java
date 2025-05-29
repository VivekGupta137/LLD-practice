package lld.stackoverflow.service;

import lld.stackoverflow.entity.Question;
import lld.stackoverflow.entity.User;
import lld.stackoverflow.entity.UserReputation;
import lld.stackoverflow.entity.Voteable;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    List<User> users;
    QuestionService questionService;

    public static UserService instance = null;

    private UserServiceImpl() {
        users = new ArrayList<>();
    }

    // lazy synchronized singleton
    public static synchronized UserService getInstance() {
        if (instance == null) {
            instance = new UserServiceImpl();
        }
        return instance;
    }

    @Override
    public User getUserById(int userId) {
        return users.stream().filter(u -> u.getId() == userId).findFirst().orElse(null);
    }

    @Override
    public User addUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public UserReputation getReputation(User user) {
        return user.getReputation();
    }

    @Override
    public List<Question> getQuestionsByUser(User user) {
        return questionService.getAllQuestions().stream().filter(q -> q.getAuthor().getId() == user.getId()).toList();
    }

}
