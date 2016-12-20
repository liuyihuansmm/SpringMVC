package com.lyh.service.impl;

import com.lyh.dao.CourseDao;
import com.lyh.model.Course;
import com.lyh.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LYH on 2016-12-20.
 */
@Service("courseService")
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

    }
}
