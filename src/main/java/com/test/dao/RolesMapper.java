package com.test.dao;

import com.test.pojo.Roles;

public interface RolesMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(Roles record);

    int insertSelective(Roles record);

    Roles selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}