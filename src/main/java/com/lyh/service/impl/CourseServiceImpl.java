package com.lyh.service.impl;

import com.lyh.dao.CourseDao;
import com.lyh.model.Course;
import com.lyh.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LYH on 2016-12-20.
 */
@Service("courseService")
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired private CourseDao courseDao;

    /**
     *
     *  @Autowired就不用写get和set方法了
    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }
     */
    @Override
    public void save(Course course) {
        courseDao.save(course);
    }
}
