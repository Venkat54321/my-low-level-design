package stackoverflow;

import java.util.List;

public class Answer {
    private Long id;
    private String content;
    private User user;
    private Question question;
    private List<Vote> voteList;
    private List<Comments> commentsList;

    public Answer(Long id, String content, User user, Question question) {
        this.id = id;
        this.content = content;
        this.user = user;
        this.question = question;
    }

    public void addVote(User user,Integer value){
        voteList.add(new Vote(user,value));
    }

    public void addComment(User user,String content){
        commentsList.add(new Comments(content,user));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Vote> getVoteList() {
        return voteList;
    }

    public void setVoteList(List<Vote> voteList) {
        this.voteList = voteList;
    }

    public List<Comments> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comments> commentsList) {
        this.commentsList = commentsList;
    }
}
