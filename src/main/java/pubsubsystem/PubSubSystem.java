package pubsubsystem;

public class PubSubSystem {

    public static void main(String[] args) {
        Topic topic1 = new Topic("topic1");
        Topic topic2 = new Topic("topic2");

        Publisher publisher1 = new Publisher();
        Publisher publisher2 = new Publisher();

        publisher1.registerTopic(topic1);
        publisher2.registerTopic(topic2);

        Subscriber subscriber1 = new PublishSubscriber("subscriber1");
        Subscriber subscriber2 = new PublishSubscriber("subscriber2");
        Subscriber subscriber3 = new PublishSubscriber("subscriber3");

        topic1.addSubscriber(subscriber1);
        topic2.addSubscriber(subscriber2);
        topic2.addSubscriber(subscriber3);

        publisher1.publishMessage(topic1,new Message("Hello world from topic 1"));
        publisher2.publishMessage(topic2, new Message("Hello, How are you! from topic 2"));

        topic2.removeSubscriber(subscriber3);

        publisher1.publishMessage(topic1,new Message("Hi world from topic 1"));
        publisher2.publishMessage(topic2, new Message("Hi, How are you! from topic 2"));
    }
}
