/*
* Copyright (c) 2017 Javachenk.com. All Rights Reserved.
*/
package com.test.service.impl;

/**
 * @author: JonyChen  Date: 2017/12/11
 */

import com.com.test.commons.DataGridModel;
import com.test.service.BillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/application-dao.xml", "classpath:spring/application-service.xml" })
public class testBillServiceImpl {

    @Autowired
    private BillService billService;

    @Test
    public void testQueryById() throws Exception {
        DataGridModel gridModel=billService.findBillAll(1,4);
        System.out.println(gridModel);
    }

}
