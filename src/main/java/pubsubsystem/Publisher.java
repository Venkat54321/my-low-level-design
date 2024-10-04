package pubsubsystem;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Publisher {
    private List<Topic> topicList;

    public Publisher(){
        topicList = new CopyOnWriteArrayList<>();
    }

    public void registerTopic(Topic topic){
        topicList.add(topic);
    }

    public void unRegister(Topic topic){
        topicList.remove(topic);
    }

    public void publishMessage(Topic topic, Message message){
        if(!topicList.contains(topic)){
            System.out.println("Topic not available for public. so first register for the topic");
        }else {
            topic.publish(message);
        }
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }
}
