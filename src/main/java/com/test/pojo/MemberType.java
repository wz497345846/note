package com.test.pojo;

import java.io.Serializable;

public class MemberType implements Serializable{
    private Integer membertypeId;

    private String membertypeName;

    private Double membertypeCost;

    private Integer monthTime;

    public Integer getMembertypeId() {
        return membertypeId;
    }

    public void setMembertypeId(Integer membertypeId) {
        this.membertypeId = membertypeId;
    }

    public String getMembertypeName() {
        return membertypeName;
    }

    public void setMembertypeName(String membertypeName) {
        this.membertypeName = membertypeName;
    }

    public Double getMembertypeCost() {
        return membertypeCost;
    }

    public void setMembertypeCost(Double membertypeCost) {
        this.membertypeCost = membertypeCost;
    }

    public Integer getMonthTime() {
        return monthTime;
    }

    public void setMonthTime(Integer monthTime) {
        this.monthTime = monthTime;
    }


}