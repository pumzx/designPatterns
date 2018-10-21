package com.panzx.proxypatterns.dynamicproxy.serviceimpl;

import com.panzx.proxypatterns.dynamicproxy.service.PersonBean;

/**
 * @author panzhixiong
 * @date 2018/10/14
 */
public class PersonBeanImpl implements PersonBean {
    String interests;
    int score;

    public PersonBeanImpl() {
        this.interests = "none";
        this.score = 0;
    }
    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setScore(int score) {
        this.score = score;
    }
}
