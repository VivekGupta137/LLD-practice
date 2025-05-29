package lld.stackoverflow.service;

import lld.stackoverflow.entity.Question;
import lld.stackoverflow.entity.User;
import lld.stackoverflow.entity.UserReputation;
import lld.stackoverflow.entity.Voteable;

import java.util.List;

public interface UserService {
    public User getUserById(int id);
    public User addUser(User user);
    public UserReputation getReputation(User user);
    public List<Question> getQuestionsByUser(User user);
}
