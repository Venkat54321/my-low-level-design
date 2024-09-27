package stackoverflow;

import java.util.List;
import java.util.Locale;

public class User {
    private Integer id;
    private String name;
    private Integer reputation;
    private List<Question> questionList;
    private List<Answer> answerList;
    private List<Comments> commentsList;



    public void askQuestion(String title,String content,List<Tags> tagsList){
        Question question = new Question(generateId(), title,content,tagsList);
        questionList.add(question);
    }

    public void ansQuestion(Question question, String content){
        Answer answer = new Answer(generateId(),content,question.getUser(),question);
        answerList.add(answer);
        question.addAnswer(answer);
    }

    public void addComment(User user,String content,Question question){
        Comments comments = new Comments(content,user);
        commentsList.add(comments);
    }

    private Long generateId() {
        return System.currentTimeMillis();
    }

    public User(Integer id, String name, Integer reputation) {
        this.id = id;
        this.name = name;
        this.reputation = reputation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public List<Comments> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comments> commentsList) {
        this.commentsList = commentsList;
    }
}
