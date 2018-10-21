package com.panzx.proxypatterns.dynamicproxy.test;

import com.panzx.proxypatterns.dynamicproxy.handler.PersonInvocationHandler;
import com.panzx.proxypatterns.dynamicproxy.service.PersonBean;
import com.panzx.proxypatterns.dynamicproxy.serviceimpl.PersonBeanImpl;

import java.lang.reflect.Proxy;

/**
 * @author panzhixiong
 * @date 2018/10/14
 */
public class TestDynamicProxy {
    public static void main(String[] args) {
        PersonBean personBean = new PersonBeanImpl();
        PersonBean personBeanProxy = getPersonProxy(personBean);
        System.out.println(null == personBeanProxy);
        System.out.println("before: interests is " + personBeanProxy.getInterests());
        System.out.println("before: score is " + personBeanProxy.getScore());
        try {
            personBeanProxy.setScore(10);
        } catch (Exception e) {
            System.out.println("can't set score");
        }
        personBeanProxy.setInterests("swimming");

        System.out.println("after: interests is " + personBeanProxy.getInterests());
        System.out.println("after: score is " + personBeanProxy.getScore());
    }

    private static PersonBean getPersonProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new PersonInvocationHandler(personBean));
    }
}
