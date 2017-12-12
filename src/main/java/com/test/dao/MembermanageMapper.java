package com.test.dao;

import com.test.pojo.Membermanage;
import com.test.pojo.MembermanageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MembermanageMapper {
    int deleteByExample(MembermanageExample example);

    int deleteByPrimaryKey(Integer memberid);

    int insert(Membermanage record);

    int insertSelective(Membermanage record);

    List<Membermanage> selectByExampleWithRowbounds(MembermanageExample example, RowBounds rowBounds);

    List<Membermanage> selectByExample(MembermanageExample example);

    Membermanage selectByPrimaryKey(Integer memberid);

    int updateByExampleSelective(@Param("record") Membermanage record, @Param("example") MembermanageExample example);

    int updateByExample(@Param("record") Membermanage record, @Param("example") MembermanageExample example);

    int updateByPrimaryKeySelective(Membermanage record);

    int updateByPrimaryKey(Membermanage record);
}