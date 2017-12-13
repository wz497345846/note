package com.test.service;

import com.test.pojo.MemberType;

import java.util.List;

public interface MemberTypeService {
    List<MemberType> getMemberTypes(String membertype_name, String month_time);

    boolean updateMemberType(MemberType memberType);

    boolean updateMember(MemberType memberType);

    boolean delMemberTypeService(String id);
}
