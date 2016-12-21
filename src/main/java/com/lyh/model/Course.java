package com.lyh.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by LYH on 2016-12-20.
 */
@Entity
@Table(name="t_course")
public class Course {

    private Integer courseId;

    private String courseName;

    private String courseDesc;

    //private List<Chapter> chapterList;
    @Id
    @Column(name="courseid",nullable = false,unique = true,length = 32)
    @GenericGenerator(name = "courseTableGenerator" , strategy = "assigned")
    @GeneratedValue(generator= "courseTableGenerator")
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Column(name = "coursename",nullable = false,length = 32)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Column(name = "coursedesc",nullable = false,length = 32)
    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }
    /*
    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }
    */
}
