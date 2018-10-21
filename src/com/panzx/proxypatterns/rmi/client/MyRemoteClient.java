package com.panzx.proxypatterns.rmi.client;

import com.panzx.proxypatterns.rmi.service.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author panzhixiong
 * @date 2018/10/14
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String result = myRemote.sayHello();
            System.out.println(result);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
