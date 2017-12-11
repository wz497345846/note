package com.test.pojo;

import java.io.Serializable;
import java.util.Date;

public class Bill implements Serializable {
    private Integer billid;

    private Integer empid;

    private Double cost;

    private String paytype;

    private Date createtime;

    private String billdesc;

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getBilldesc() {
        return billdesc;
    }

    public void setBilldesc(String billdesc) {
        this.billdesc = billdesc == null ? null : billdesc.trim();
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billid=" + billid +
                ", empid=" + empid +
                ", cost=" + cost +
                ", paytype='" + paytype + '\'' +
                ", createtime=" + createtime +
                ", billdesc='" + billdesc + '\'' +
                '}';
    }
}