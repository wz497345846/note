package com.test.service;

import com.test.pojo.MemberType;

import java.util.List;

public interface MemberTypeService {

    boolean updateMemberType(MemberType memberType);

    boolean updateMember(MemberType memberType);

    boolean delMemberTypeService(String id);

    List<MemberType> getMemberTypes(MemberType memberType, String page, String rows);
}
