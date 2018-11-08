package com.panzx.observerpatterns.demo002.observer;

import com.panzx.observerpatterns.demo002.diaplay.DispalyElements;

import java.util.Observable;
import java.util.Observer;

/**
 * @author panzhixiong
 * @date 2018/11/9
 */
public class SubscribeNewsPaper6Observer implements Observer, DispalyElements {
    String content;

    public SubscribeNewsPaper6Observer(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.content = (String) arg;
        dispaly();
    }

    @Override
    public void dispaly() {
        System.out.println("subscriber6 receive the news update! this newspaper's content is " + this.content);

    }
}
