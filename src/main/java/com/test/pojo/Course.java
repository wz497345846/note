package com.test.pojo;

public class Course {
    private Integer courseid;

    private String coursename;

    private Double coursefee;

    private Boolean isappoint;

    private Integer coursecount;

    private String coursedesc;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Double getCoursefee() {
        return coursefee;
    }

    public void setCoursefee(Double coursefee) {
        this.coursefee = coursefee;
    }

    public Boolean getIsappoint() {
        return isappoint;
    }

    public void setIsappoint(Boolean isappoint) {
        this.isappoint = isappoint;
    }

    public Integer getCoursecount() {
        return coursecount;
    }

    public void setCoursecount(Integer coursecount) {
        this.coursecount = coursecount;
    }

    public String getCoursedesc() {
        return coursedesc;
    }

    public void setCoursedesc(String coursedesc) {
        this.coursedesc = coursedesc;
    }
}