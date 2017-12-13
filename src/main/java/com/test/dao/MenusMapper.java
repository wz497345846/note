package com.test.dao;

import com.test.pojo.Menus;
import com.test.pojo.MenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MenusMapper {
    int deleteByExample(MenusExample example);

    int deleteByPrimaryKey(Integer menuid);

    int insert(Menus record);

    int insertSelective(Menus record);

    List<Menus> selectByExampleWithRowbounds(MenusExample example, RowBounds rowBounds);

    List<Menus> selectByExample(MenusExample example);

    Menus selectByPrimaryKey(Integer menuid);

    int updateByExampleSelective(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByExample(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByPrimaryKeySelective(Menus record);

    int updateByPrimaryKey(Menus record);
}