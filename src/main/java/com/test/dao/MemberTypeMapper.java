package com.test.dao;

import com.test.pojo.MemberType;
import com.test.pojo.MemberTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberTypeMapper {
    int deleteByExample(MemberTypeExample example);

    int deleteByPrimaryKey(Integer membertypeId);

    int insert(MemberType record);

    int insertSelective(MemberType record);

    List<MemberType> selectByExampleWithRowbounds(MemberTypeExample example, RowBounds rowBounds);

    List<MemberType> selectByExample(MemberTypeExample example);

    MemberType selectByPrimaryKey(Integer membertypeId);

    int updateByExampleSelective(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    int updateByExample(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    int updateByPrimaryKeySelective(MemberType record);

    int updateByPrimaryKey(MemberType record);
}