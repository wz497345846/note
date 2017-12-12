/*
* Copyright (c) 2017 Javachenk.com. All Rights Reserved.
*/
package com.test.service.impl;

/**
 * @author: JonyChen  Date: 2017/12/11
 */

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/application-dao.xml", "classpath:spring/application-service.xml" })
public class testBillServiceImpl {

 /*   @Autowired
    private BillMapper billMapper;

    @Test
    public void testQueryById() throws Exception {
        Integer billid = 2017002;
        Bill bill = billMapper.selectByPrimaryKey(billid);
        System.out.println(bill);
    }*/

}
