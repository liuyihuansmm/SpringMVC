package com.lyh.service.impl;

import com.lyh.dao.CourseDao;
import com.lyh.model.Course;
import com.lyh.service.CourseService;
import org.springframework.stereotype.Service;

/**
 * Created by LYH on 2016-12-20.
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao;

    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void save(Course course) {

    }
}
