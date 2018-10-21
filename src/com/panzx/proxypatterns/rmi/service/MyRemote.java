package com.panzx.proxypatterns.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author panzhixiong
 * @date 2018/10/14
 */
public interface MyRemote extends Remote {
    /**
     * get 'hello,world!'
     *
     * @return String hello,world!
     * @throws RemoteException  远程异常
     */
    public String sayHello() throws RemoteException;
}
