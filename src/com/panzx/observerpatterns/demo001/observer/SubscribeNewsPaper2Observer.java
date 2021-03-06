package com.panzx.observerpatterns.demo001.observer;

import com.panzx.observerpatterns.demo001.dispaly.DispalyElements;
import com.panzx.observerpatterns.demo001.subject.Subject;

/**
 * @author panzhixiong
 * @date 2018/11/8
 */
public class SubscribeNewsPaper2Observer implements Observer, DispalyElements {
    private int words;
    private String content;

    public SubscribeNewsPaper2Observer(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(Object data1, Object data2) {
        this.words = (int) data1;
        this.content = (String) data2;
        dispaly();
    }

    @Override
    public void dispaly() {
        System.out.println("subscriber2 receive the news update! this newspaper's words is " + this.words + ",the content is " + this.content);
    }
}
