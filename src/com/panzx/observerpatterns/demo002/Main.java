package com.panzx.observerpatterns.demo002;

import com.panzx.observerpatterns.demo002.observer.SubscribeNewsPaper4Observer;
import com.panzx.observerpatterns.demo002.observer.SubscribeNewsPaper5Observer;
import com.panzx.observerpatterns.demo002.observer.SubscribeNewsPaper6Observer;
import com.panzx.observerpatterns.demo002.subject.NewspaperOfficeSubject;

/**
 * @author panzhixiong
 * @date 2018/11/9
 */
public class Main {
    public static void main(String[] args) {
        NewspaperOfficeSubject subject = new NewspaperOfficeSubject();
        SubscribeNewsPaper4Observer observer4 = new SubscribeNewsPaper4Observer(subject);
        SubscribeNewsPaper5Observer observer5 = new SubscribeNewsPaper5Observer(subject);

        subject.setContent("BeiJIng");
        subject.measurementsChanged();

        subject.setContent("ShangHai");
        subject.measurementsChanged();

        // 新增一个订阅者
        SubscribeNewsPaper6Observer observer6 = new SubscribeNewsPaper6Observer(subject);
        subject.setContent("ShenZhen");
        subject.measurementsChanged();

        // 注销一个订阅者
        subject.deleteObserver(observer4);
        subject.setContent("GuangZhou");
        subject.measurementsChanged();
    }
}
