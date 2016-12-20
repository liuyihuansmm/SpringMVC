package com.lyh.controller;

import com.lyh.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LYH on 2016-12-20.
 */
@Controller
@RequestMapping("/course")
public class CourseController {

    private CourseService courseService;

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

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
        System.out.println("保存成功");
        return "course_list";
    }
}
