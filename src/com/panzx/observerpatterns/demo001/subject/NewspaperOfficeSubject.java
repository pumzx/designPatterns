package com.panzx.observerpatterns.demo001.subject;

import com.panzx.observerpatterns.demo001.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author panzhixiong
 * @date 2018/11/8
 */
public class NewspaperOfficeSubject implements Subject {

    /**
     * 使用组合
     */
    private List<Observer> observerList;

    /**
     * 数据格式不太好，可能有些观察者不需要content字段
     */
    private int words;
    private String content;

    private boolean state;

    public NewspaperOfficeSubject() {
        observerList = new ArrayList<>();
        state = false;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
        System.out.println("add a subscriber : " + observer.toString());
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(index);
        }
        System.out.println("remove a subscriber : " + observer.toString());
    }

    @Override
    public void notifyObservers() {
        // 通知所有观察者更新的条件
        setChange(words);
        if (getChange()) {
            for (Observer observer : observerList) {
                observer.update(words, content);
            }
        }
        setChange(0);

    }

    /**
     * 更新状态数据后，通知所有观察者
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void setChange(int words) {
        if (0 == words) {
            state = false;
        } else {
            state = true;
        }
    }

    @Override
    public boolean getChange() {
        return state;
    }

    /**
     * 假装更新主题的状态：words
     *
     * @param words 字数
     */
    public void setWords(int words) {
        this.words = words;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //如果观察者通过"拉"的形式获取数据，这里还需要定义getter方法

    public int getWords() {
        return words;
    }

    public String getContent() {
        return content;
    }
}
