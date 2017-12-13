package com.test.dao;

import com.test.pojo.MenuRole;
import com.test.pojo.MenuRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MenuRoleMapper {
    int deleteByExample(MenuRoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(MenuRole record);

    int insertSelective(MenuRole record);

    List<MenuRole> selectByExampleWithRowbounds(MenuRoleExample example, RowBounds rowBounds);

    List<MenuRole> selectByExample(MenuRoleExample example);

    MenuRole selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") MenuRole record, @Param("example") MenuRoleExample example);

    int updateByExample(@Param("record") MenuRole record, @Param("example") MenuRoleExample example);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);
}