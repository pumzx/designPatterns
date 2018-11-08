package com.panzx.observerpatterns.demo001;

import com.panzx.observerpatterns.demo001.observer.SubscribeNewsPaper1Observer;
import com.panzx.observerpatterns.demo001.observer.SubscribeNewsPaper2Observer;
import com.panzx.observerpatterns.demo001.observer.SubscribeNewsPaper3Observer;
import com.panzx.observerpatterns.demo001.subject.NewspaperOfficeSubject;

/**
 * @author panzhixiong
 * @date 2018/11/8
 */
public class Main {
    public static void main(String[] args) {
        NewspaperOfficeSubject subject = new NewspaperOfficeSubject();
        SubscribeNewsPaper1Observer observer1 = new SubscribeNewsPaper1Observer(subject);
        SubscribeNewsPaper2Observer observer2 = new SubscribeNewsPaper2Observer(subject);

        // 假装更新主题的状态
        subject.setWords(10);
        subject.setContent("the first day news");
        subject.measurementsChanged();

        subject.setWords(20);
        subject.setContent("the second day news");
        subject.measurementsChanged();

        // 新增一个订阅者
        SubscribeNewsPaper3Observer observer3 = new SubscribeNewsPaper3Observer(subject);

        subject.setWords(30);
        subject.setContent("the third day news");
        subject.measurementsChanged();

        // 注销一个订阅者
        subject.removeObserver(observer2);

        subject.setWords(40);
        subject.setContent("the fourth day news");
        subject.measurementsChanged();

    }
}
