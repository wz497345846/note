package com.test.pojo;

import java.io.Serializable;
import java.util.Date;

public class Bill  implements Serializable{
	 private Integer billid; //账单编号

	    private Integer empid;//记账人编号

	    private Double cost;//消费总额

	    private String paytype;//支付类型

	    private Date createtime;//记账日期

	    private String billdesc;//账单备注

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
}