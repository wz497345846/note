package com.test.dao;

import com.test.pojo.Membermanage;

public interface MembermanageMapper {
    int deleteByPrimaryKey(Integer memberid);

    int insert(Membermanage record);

    int insertSelective(Membermanage record);

    Membermanage selectByPrimaryKey(Integer memberid);

    int updateByPrimaryKeySelective(Membermanage record);

    int updateByPrimaryKey(Membermanage record);
}