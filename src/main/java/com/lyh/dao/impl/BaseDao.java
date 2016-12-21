package com.lyh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by LYH on 2016-12-21.
 */
@Repository
public class BaseDao extends HibernateDaoSupport{

    //private SessionFactory sessionFactory;
    @Autowired
    public void  setSessionFactorySuper(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    /*
    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    */

}
