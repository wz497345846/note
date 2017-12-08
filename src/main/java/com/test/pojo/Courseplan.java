package com.test.pojo;

import java.util.Date;

public class Courseplan {
    private Integer courseplanid;

    private Integer courseid;

    private Double coursetime;

    private Date starttime;

    private String coursetype;

    private Date createtime;

    private String courseplandesc;

    public Integer getCourseplanid() {
        return courseplanid;
    }

    public void setCourseplanid(Integer courseplanid) {
        this.courseplanid = courseplanid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Double getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(Double coursetime) {
        this.coursetime = coursetime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCourseplandesc() {
        return courseplandesc;
    }

    public void setCourseplandesc(String courseplandesc) {
        this.courseplandesc = courseplandesc;
    }
}