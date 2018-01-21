package com.java.designpatterns.observer;

import org.junit.Test;

public class ObserverPatternTest {

    @Test
    public void test() {
        MyTopic myTopic = new MyTopic();

        Observer ob1 = new MyTopicSubscriber("ob1", myTopic);
        Observer ob2 = new MyTopicSubscriber("ob2", myTopic);
        Observer ob3 = new MyTopicSubscriber("ob3", myTopic);

        myTopic.register(ob1);
        myTopic.register(ob2);
        myTopic.register(ob3);

        myTopic.postMessage("Hey");
        myTopic.notifyObservers();
    }
} 