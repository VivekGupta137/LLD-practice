package lld.stackoverflow;

import lld.Driver;
import lld.stackoverflow.entity.Answer;
import lld.stackoverflow.entity.Question;
import lld.stackoverflow.entity.User;
import lld.stackoverflow.entity.Vote;
import lld.stackoverflow.enums.VOTE_TYPE;
import lld.stackoverflow.service.*;

public class StackOverflowDriver implements Driver {
    @Override
    public void start() {
        // create the singleton instance of all the services
        UserService userService = UserServiceImpl.getInstance();
        QuestionService questionService = QuestionServiceImpl.getInstance();
        AnswerService answerService = AnswerServiceImpl.getInstance();

        // add couple of users
        User user1 = userService.addUser(new User(1));
        User user2 = userService.addUser(new User(2));

        // create couple of questions
        Question question1 = questionService.addQuestion(new Question(1, user1));
        Question question2 = questionService.addQuestion(new Question(2, user2));
        Question question3 = questionService.addQuestion(new Question(3, user2));

        // check user reputation
        System.out.println("user1 = +"+userService.getReputation(user1).getScore() + " reputation");;
        System.out.println("user1 = +"+userService.getReputation(user2).getScore() + " reputation");;

        // create couple of answers
        Answer answer1 = answerService.addAnswer(new Answer(1, user1, question1));
        Answer answer2 = answerService.addAnswer(new Answer(2, user2, question1));
        Answer answer3 = answerService.addAnswer(new Answer(3, user1, question2));

        // create couple of votes by user1
        answerService.addVote(answer1, new Vote(VOTE_TYPE.UPVOTE, user1));
        questionService.addVote(question1, new Vote(VOTE_TYPE.UPVOTE, user1));

        // create couple of votes by user2
        answerService.addVote(answer2, new Vote(VOTE_TYPE.UPVOTE, user2));
        questionService.addVote(question2, new Vote(VOTE_TYPE.UPVOTE, user2));
        questionService.addVote(question1, new Vote(VOTE_TYPE.UPVOTE, user2));



        // check the upvotes for questions
        System.out.println("question1 = +"+question1.getVoteManager().getVotes().stream().reduce(0, (total, vote) -> total + (vote.getVoteType() == VOTE_TYPE.UPVOTE ? 1 : 0), Integer::sum) + " upvotes");
        System.out.println("question2 = +"+question2.getVoteManager().getVotes().stream().reduce(0, (total, vote) -> total + (vote.getVoteType() == VOTE_TYPE.UPVOTE ? 1 : 0), Integer::sum) + " upvotes");


    }
}
