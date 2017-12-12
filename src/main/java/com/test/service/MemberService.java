package com.test.service;

import com.test.pojo.Membermanage;

import java.util.List;

public interface MemberService {
    List<Membermanage> selectMembers(Membermanage membermanage, String page, String rows);
}
