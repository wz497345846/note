package com.test.pojo;

import java.io.Serializable;

public class Roles implements Serializable{
    private Integer roleid;

    private String roletype;

    private Integer menuid;

    private String roledesc;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roleid=" + roleid +
                ", roletype='" + roletype + '\'' +
                ", menuid=" + menuid +
                ", roledesc='" + roledesc + '\'' +
                '}';
    }
}