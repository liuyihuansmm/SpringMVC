package com.lyh.dao.impl;

import com.lyh.dao.CourseDao;
import com.lyh.model.Course;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by LYH on 2016-12-20.
 */
@Repository("courseDao")
public class CourseDaoImpl extends BaseDao implements CourseDao {

    @Override
    public void saveCourse(Course course) {
        this.getHibernateTemplate().save(course);
    }
}
