package com.panzx.proxypatterns.dynamicproxy.handler;

import com.panzx.proxypatterns.dynamicproxy.service.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author panzhixiong
 * @date 2018/10/14
 */
public class PersonInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public PersonInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(personBean, args);
        } else if (method.getName().equals("setScore")) {
            throw new IllegalAccessException();
        } else if (method.getName().startsWith("set")) {
            method.invoke(personBean, args);
        }
        return null;
    }
}
