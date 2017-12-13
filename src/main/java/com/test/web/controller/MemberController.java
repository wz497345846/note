package com.test.web.controller;

import com.test.pojo.Membermanage;
import com.test.pojo.MembermanageExample;
import com.test.service.MemberService;
import com.test.service.impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MemberController {
    @Autowired
    MemberServiceImpl memberServiceImpl;

    /**
     * 获取所有会员
     */
    @RequestMapping("getMembers")
    @ResponseBody
    public List<Membermanage> getMembers(Membermanage membermanage,String page,String rows){
        return memberServiceImpl.selectMembers(membermanage,page,rows);
    }

    /**
     * 新建会员
     */
    @RequestMapping("createMember")
    @ResponseBody
    public Map createMember(Membermanage membermanage){
        boolean flag=memberServiceImpl.addMember(membermanage);
        Map map=new HashMap();
        if (flag){
            map.put("success",true);
        }else {
            map.put("msg","服务器繁忙");
        }
        return map;
    }

    /**
     * 删除会员
     */
    @RequestMapping("delMember")
    @ResponseBody
    public Map delMember(String id){
        boolean flag=memberServiceImpl.delMember(id);
        Map map=new HashMap();
        if (flag){
            map.put("success",true);
        }else {
            map.put("msg","服务器繁忙");
        }
        return map;
    }

    /**
     * 编辑会员
     */
    @RequestMapping("updateMember")
    @ResponseBody
    public Map updateMember(Membermanage membermanage,String id){
        System.out.println(id);
        membermanage.setMemberid(Integer.valueOf(id));
        boolean flag=memberServiceImpl.updateMember(membermanage);
        Map map=new HashMap();
        if (flag){
            map.put("success",true);
        }else {
            map.put("msg","服务器繁忙");
        }
        return map;
    }

}
