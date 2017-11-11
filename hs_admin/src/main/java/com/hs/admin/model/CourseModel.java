package com.hs.admin.model;

/**
 * @user :flyxk
 * date :2017/11/10
 */
public class CourseModel {
    private String course_name;
    private String id;

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CourseModel{" +
                "course_name='" + course_name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
