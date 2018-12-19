package com.tt.teach.pojo;

/**
 * @作者：zhujungui
 * @时间：2018/12/19 15:15
 * @描述：成绩表——实体类
 */
public class Grade {
    private Integer gradeID;
    private String gradeName;

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Grade(Integer gradeID, String gradeName) {
        this.gradeID = gradeID;
        this.gradeName = gradeName;
    }

    public Grade() {
    }
}
