package com.lyh.dao.impl;

import com.lyh.dao.CourseDao;
import com.lyh.model.Course;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by LYH on 2016-12-20.
 */
@Repository("courseDao")
public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Course course) {
        this.getHibernateTemplate().save(course);
    }
}
