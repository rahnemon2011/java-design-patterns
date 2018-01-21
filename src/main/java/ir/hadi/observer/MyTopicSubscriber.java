package ir.hadi.observer;

public class MyTopicSubscriber implements Observer {

    private final String name;
    private final Subject subject;

    public MyTopicSubscriber(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void update() {
        String message = (String) subject.getUpdate(subject);
        if (message == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming Message::" + message);
        }
    }
}