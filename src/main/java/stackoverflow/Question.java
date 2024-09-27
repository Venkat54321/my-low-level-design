package stackoverflow;

import java.util.List;
import java.util.Locale;

public class Question {
    private Long id;
    private String title;
    private String content;
    private User user;
    private List<Answer> answerList;
    private List<Comments> commentsList;
    private List<Tags> tagsList;
    List<Vote> voteList;

    public Question(Long id, String title, String content, List<Tags> tagsLists) {
        this.id = id;
        this.title = title;
        this.content = content;
        for(Tags tag : tagsLists){
            this.tagsList.add(new Tags(tag.getName()));
        }
    }

    public void addAnswer(Answer answer){
        answerList.add(answer);
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<Tags> getTagsList() {
        return tagsList;
    }

    public void setTagsList(List<Tags> tagsList) {
        this.tagsList = tagsList;
    }

    public List<Vote> getVoteList() {
        return voteList;
    }

    public void setVoteList(List<Vote> voteList) {
        this.voteList = voteList;
    }
}
