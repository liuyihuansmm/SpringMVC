package com.lyh.controller;

import com.lyh.model.Course;
import com.lyh.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LYH on 2016-12-20.
 */
@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired private CourseService courseService;
    /**
     *  @Autowired就不用写get和set方法了
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }
     */
    @RequestMapping("/list")
    public String list(){
        return "course_list";
    }

    @RequestMapping(value="/edit", method= RequestMethod.GET,params = "add")
    public String createCourse(){
        return "course_edit";
    }

    @RequestMapping(value="/save", method= RequestMethod.POST)
    public String doSave(){
        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("JAVA大法好啊");
        course.setCourseDesc("一群了垃圾");
        courseService.save(course);
        System.out.println("保存成功");
        return "course_list";
    }
}
