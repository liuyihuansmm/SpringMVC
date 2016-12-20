package com.lyh.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by LYH on 2016-12-20.
 */
@Entity
@Table(name="course")
public class Course {
    @Id
    @Column(name="id",nullable = false,unique = true,length = 32)
    @GenericGenerator(name = "courseTableGenerator" , strategy = "native")
    @GeneratedValue(generator= "courseTableGenerator")
    private Integer courseId;

    @Column(name = "name",nullable = false,length = 32)
    private String courseName;

    @Column(name = "desc",nullable = false,length = 32)
    private String courseDesc;

    private List<Chapter> chapterList;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }
}
