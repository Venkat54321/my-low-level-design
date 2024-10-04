package pubsubsystem;

public class PublishSubscriber implements Subscriber {

    private String name;

    public PublishSubscriber(String name){
        this.name = name;
    }

    @Override
    public void onMessage(Message message) {
        System.out.println(name +  " Received message " + message.getContent());
    }
}
