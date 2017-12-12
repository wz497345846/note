package com.test.service.impl;

import com.test.dao.MembermanageMapper;
import com.test.pojo.Membermanage;
import com.test.pojo.MembermanageExample;
import com.test.service.MemberService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MembermanageMapper membermanageMapper;

    public List<Membermanage> selectMembers(Membermanage membermanage, String page, String rows) {
        MembermanageExample membermanageExample=new MembermanageExample();
        MembermanageExample.Criteria criteria=membermanageExample.createCriteria();
        if (!(membermanage.getMembername()==null||membermanage.getMembername().equals(""))){
            criteria.andMembernameEqualTo(membermanage.getMembername());
        }
        if (!(membermanage.getMemberphone()==null||membermanage.getMemberphone().equals(""))){
            criteria.andMemberphoneEqualTo(membermanage.getMemberphone());
        }
        int offset=(Integer.parseInt(page)-1)*Integer.parseInt(rows);
        RowBounds rowBounds=new RowBounds(offset,Integer.parseInt(rows));
        return membermanageMapper.selectByExampleWithRowbounds(membermanageExample,rowBounds);
    }
}
