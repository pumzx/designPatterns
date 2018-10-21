package com.panzx.proxypatterns.rmi.serviceimpl;

import com.panzx.proxypatterns.rmi.service.MyRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author panzhixiong
 * @date 2018/10/14
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException { }

    @Override
    public String sayHello() {
        return "hello,world!";
    }
}
