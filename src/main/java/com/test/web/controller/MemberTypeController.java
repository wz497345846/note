package com.test.web.controller;

import com.test.pojo.MemberType;
import com.test.service.impl.MemberTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MemberTypeController {
    @Autowired
    private MemberTypeServiceImpl memberTypeServiceImpl;

    /**
     * 获取相关会员卡信息
     */
    @RequestMapping("/getMemberTypes")
    @ResponseBody
    public List<MemberType> getMemberTypes(MemberType memberType, String page, String rows){
        List<MemberType> list=memberTypeServiceImpl.getMemberTypes(memberType,page,rows);
        System.out.println(list);
        return list;
    }

    /**
     * 新建会员卡信息
     */
    @RequestMapping("/createMemberType")
    @ResponseBody
    public Map createMemberType(MemberType memberType){
        boolean flag=memberTypeServiceImpl.updateMemberType(memberType);
        Map map=new HashMap();
        if (flag){
            map.put("success",true);
        }else {
            map.put("msg","服务器繁忙");
        }
        return map;
    }

    /**
     * 修改会员卡信息
     */
    @RequestMapping("/updateMemberType")
    @ResponseBody
    public Map updateMemberType(MemberType memberType,String id){
        memberType.setMembertypeId(Integer.valueOf(id));
        boolean flag=memberTypeServiceImpl.updateMember(memberType);
        Map map=new HashMap();
        if (flag){
            map.put("success",true);
        }else {
            map.put("msg","服务器繁忙");
        }
        return map;
    }

    /**
     * 删除会员卡信息
     */
    @RequestMapping("/delMemberType")
    @ResponseBody
    public Map delMemberType(String id){
        boolean flag=memberTypeServiceImpl.delMemberTypeService(id);
        Map map=new HashMap();
        if (flag){
            map.put("success",true);
        }else {
            map.put("msg","服务器繁忙");
        }
        return map;
    }

    /**
     * 获取会员卡信息
     */

    @RequestMapping("/getAllVipTypes")
    @ResponseBody
    public List<MemberType> getAllVipTypes(){
        return memberTypeServiceImpl.getAllVipTypesService();
    }

}
