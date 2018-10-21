package com.panzx.proxypatterns.rmi.server;

import com.panzx.proxypatterns.rmi.service.MyRemote;
import com.panzx.proxypatterns.rmi.serviceimpl.MyRemoteImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author panzhixiong
 * @date 2018/10/14
 */
public class MyRemoteServer {
    public static void main(String[] args) throws RemoteException {
        MyRemote myRemote = new MyRemoteImpl();
        try {
            Naming.rebind("RemoteHello", myRemote);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
