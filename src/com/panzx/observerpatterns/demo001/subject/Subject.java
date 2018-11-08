package com.panzx.observerpatterns.demo001.subject;

import com.panzx.observerpatterns.demo001.observer.Observer;

/**
 * @author panzhixiong
 * @date 2018/11/8
 */
public interface Subject {
    /**
     * 注册观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 注销观察者
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();

    /**
     * 设置是否通知所有观察者的状态
     * @param state 状态
     */
    public void setChange(int state);

    /**
     * 获取当前是否通知所有观察者的状态
     * @return <boolean> 当前是否通知所有观察者的状态
     */
    public boolean getChange();
}
