package com.panzx.observerpatterns.demo002.subject;

import java.util.Observable;

/**
 * @author panzhixiong
 * @date 2018/11/9
 */
public class NewspaperOfficeSubject extends Observable {
    private String content;

    public NewspaperOfficeSubject() {
    }

    /**
     * 更新状态数据后，通知所有观察者
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers(content);
    }

    public void setContent(String content) {
        this.content = content;
    }
}
