package com.test.service.impl;

import com.test.dao.CoursetypeMapper;
import com.test.pojo.Coursetype;
import com.test.service.CoursetypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursetypeServiceImpl implements CoursetypeService {
    @Autowired
    CoursetypeMapper cm;
    public List<Coursetype> findAllType() {
        return null;
    }
}
