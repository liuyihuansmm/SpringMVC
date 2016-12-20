package com.lyh.model;

/**
 * Created by LYH on 2016-12-20.
 */
public class Chapter {

    private Integer chapterId;

    private Integer courseId;

    private String chapterName;

    private String chapterDesc;

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getChapterDesc() {
        return chapterDesc;
    }

    public void setChapterDesc(String chapterDesc) {
        this.chapterDesc = chapterDesc;
    }
}
