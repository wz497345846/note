package com.test.service.impl;

import com.test.dao.MemberTypeMapper;
import com.test.pojo.MemberType;
import com.test.pojo.MemberTypeExample;
import com.test.service.MemberTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberTypeServiceImpl implements MemberTypeService {
    @Autowired
    private MemberTypeMapper memberTypeMapper;

    /**
     *  根据条件获取相关会员卡类型信息
     */
    public List<MemberType> getMemberTypes(String membertype_name, String month_time) {
        MemberTypeExample memberTypeExample=new MemberTypeExample();
        MemberTypeExample.Criteria criteria=memberTypeExample.createCriteria();
        if (membertype_name!=null&&membertype_name.length()>0){
            criteria.andMembertypeNameLike(membertype_name);
        }
        if (month_time!=null&&month_time.length()>0){
            criteria.andMonthTimeEqualTo(Integer.parseInt(month_time));
        }
        return memberTypeMapper.selectByExample(memberTypeExample);
    }

    /**
     *  新建会员卡信息
     */
    public boolean updateMemberType(MemberType memberType) {
        int x=memberTypeMapper.insertSelective(memberType);
        if (x>0){
            return true;
        }
        return false;
    }

    /**
     *  修改会员卡信息
     */
    public boolean updateMember(MemberType memberType) {
        int x=memberTypeMapper.updateByPrimaryKeySelective(memberType);
        if (x>0){
            return true;
        }
        return false;
    }

    /**
     *  删除会员卡信息
     */
    public boolean delMemberTypeService(String id) {
        int x=memberTypeMapper.deleteByPrimaryKey(Integer.parseInt(id));
        if (x>0){
            return true;
        }
        return false;
    }
}
