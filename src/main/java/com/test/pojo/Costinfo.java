package com.test.pojo;

import java.io.Serializable;

public class Costinfo implements Serializable{
    private Integer costinfoid;

    private Integer billid;

    private Integer costiteam;

    private String costplandesc;

    public Integer getCostinfoid() {
        return costinfoid;
    }

    public void setCostinfoid(Integer costinfoid) {
        this.costinfoid = costinfoid;
    }

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public Integer getCostiteam() {
        return costiteam;
    }

    public void setCostiteam(Integer costiteam) {
        this.costiteam = costiteam;
    }

    public String getCostplandesc() {
        return costplandesc;
    }

    public void setCostplandesc(String costplandesc) {
        this.costplandesc = costplandesc;
    }

    @Override
    public String toString() {
        return "Costinfo{" +
                "costinfoid=" + costinfoid +
                ", billid=" + billid +
                ", costiteam=" + costiteam +
                ", costplandesc='" + costplandesc + '\'' +
                '}';
    }
}