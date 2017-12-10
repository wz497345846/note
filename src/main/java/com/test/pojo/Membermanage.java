package com.test.pojo;

import java.io.Serializable;
import java.util.Date;

public class Membermanage implements Serializable{
    private Integer memberid;

    private String membername;

    private String memberpwd;

    private String memberphone;

    private String membersex;

    private String memberavatar;

    private Date memberbirth;

    private String referee;

    private Integer empid;

    private String memberremark;

    private String memberdesc;

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getMemberpwd() {
        return memberpwd;
    }

    public void setMemberpwd(String memberpwd) {
        this.memberpwd = memberpwd;
    }

    public String getMemberphone() {
        return memberphone;
    }

    public void setMemberphone(String memberphone) {
        this.memberphone = memberphone;
    }

    public String getMembersex() {
        return membersex;
    }

    public void setMembersex(String membersex) {
        this.membersex = membersex;
    }

    public String getMemberavatar() {
        return memberavatar;
    }

    public void setMemberavatar(String memberavatar) {
        this.memberavatar = memberavatar;
    }

    public Date getMemberbirth() {
        return memberbirth;
    }

    public void setMemberbirth(Date memberbirth) {
        this.memberbirth = memberbirth;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getMemberremark() {
        return memberremark;
    }

    public void setMemberremark(String memberremark) {
        this.memberremark = memberremark;
    }

    public String getMemberdesc() {
        return memberdesc;
    }

    public void setMemberdesc(String memberdesc) {
        this.memberdesc = memberdesc;
    }

    @Override
    public String toString() {
        return "Membermanage{" +
                "memberid=" + memberid +
                ", membername='" + membername + '\'' +
                ", memberpwd='" + memberpwd + '\'' +
                ", memberphone='" + memberphone + '\'' +
                ", membersex='" + membersex + '\'' +
                ", memberavatar='" + memberavatar + '\'' +
                ", memberbirth=" + memberbirth +
                ", referee='" + referee + '\'' +
                ", empid=" + empid +
                ", memberremark='" + memberremark + '\'' +
                ", memberdesc='" + memberdesc + '\'' +
                '}';
    }
}