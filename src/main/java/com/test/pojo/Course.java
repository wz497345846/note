package com.test.pojo;

public class Course {
    private Integer courseid;

    private Integer empid;

    private String coursetype;

    private String coursename;

    private Double coursefee;

    private Integer currentnum;

    private Integer coursecount;

    private String coursedesc;

    private String curriculumstart;

    private String curriculumend;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
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

    public Integer getCurrentnum() {
        return currentnum;
    }

    public void setCurrentnum(Integer currentnum) {
        this.currentnum = currentnum;
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

    public String getCurriculumstart() {
        return curriculumstart;
    }

    public void setCurriculumstart(String curriculumstart) {
        this.curriculumstart = curriculumstart;
    }

    public String getCurriculumend() {
        return curriculumend;
    }

    public void setCurriculumend(String curriculumend) {
        this.curriculumend = curriculumend;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", empid=" + empid +
                ", coursetype='" + coursetype + '\'' +
                ", coursename='" + coursename + '\'' +
                ", coursefee=" + coursefee +
                ", currentnum=" + currentnum +
                ", coursecount=" + coursecount +
                ", coursedesc='" + coursedesc + '\'' +
                ", curriculumstart='" + curriculumstart + '\'' +
                ", curriculumend='" + curriculumend + '\'' +
                '}';
    }
}