package com.test.pojo;

import java.io.Serializable;
/**
 * 消费明细实体类
 */
public class Costinfo  implements Serializable {
	 private Integer costinfoid;//消费明细编号

	    private Integer billid;//账单编号

	    private Integer costiteam;//消费项

	    private String costplandesc;//消费明细备注

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
        this.costplandesc = costplandesc == null ? null : costplandesc.trim();
    }
}