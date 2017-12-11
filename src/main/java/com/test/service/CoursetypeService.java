package com.test.service;

import com.test.pojo.Coursetype;

import java.util.List;

public interface CoursetypeService {
    /**
     * 查找所有课程分类
     * @return
     */
    List<Coursetype> findAllType();
}
