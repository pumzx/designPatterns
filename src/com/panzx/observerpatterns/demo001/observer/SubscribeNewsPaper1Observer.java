package com.panzx.observerpatterns.demo001.observer;

import com.panzx.observerpatterns.demo001.dispaly.DispalyElements;
import com.panzx.observerpatterns.demo001.subject.Subject;

/**
 * @author panzhixiong
 * @date 2018/11/8
 */
public class SubscribeNewsPaper1Observer implements Observer, DispalyElements {

    private int words;
    private String content;

    public SubscribeNewsPaper1Observer(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(Object data1, Object data2) {
        this.words = (int) data1;
        this.content = (String) data2;
        // 更新就展示好不好？如果利用了MVC模式就觉得不太好了
        dispaly();
    }

    @Override
    public void dispaly() {
        System.out.println("subscriber1 receive the news update! this newspaper's words is " + this.words + ",the content is " + this.content);
    }
}
