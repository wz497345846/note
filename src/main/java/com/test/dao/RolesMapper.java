package com.test.dao;

import com.test.pojo.Roles;
import com.test.pojo.RolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RolesMapper {
    int deleteByExample(RolesExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(Roles record);

    int insertSelective(Roles record);

    List<Roles> selectByExampleWithRowbounds(RolesExample example, RowBounds rowBounds);

    List<Roles> selectByExample(RolesExample example);

    Roles selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}