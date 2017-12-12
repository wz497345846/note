/*
* Copyright (c) 2017 Javachenk.com. All Rights Reserved.
*/
package com.com.test.commons;

import java.util.List;

/**
 * @author: JonyChen  Date: 2017/12/12
 */
public class DataGridModel {

    private Long total;
    private List<?> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}

