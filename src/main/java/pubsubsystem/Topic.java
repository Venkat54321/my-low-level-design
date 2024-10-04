package pubsubsystem;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class Topic {
    private String topicName;
    private List<Subscriber> subscribers = new CopyOnWriteArrayList<>();

    public Topic(String name) {
        this.topicName = name;
    }

    public void publish(Message message){
        for(Subscriber subscriber: subscribers){
            subscriber.onMessage(message);
        }
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }
}
