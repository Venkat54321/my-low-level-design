package stackoverflow;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StackOverFlow {

    private Map<Integer,User> userDetails;
    private Map<Integer,Question> questionDetails;
    private Map<Integer,Answer> answerDetails;
    private Map<String,Tags> tagDetails;

    public StackOverFlow() {
        userDetails  = new ConcurrentHashMap<>();
        questionDetails = new ConcurrentHashMap<>();
        answerDetails = new ConcurrentHashMap<>();
        tagDetails = new ConcurrentHashMap<>();
    }

    public void postQuestion(User user, String content, List<String> tags){
    }

}
