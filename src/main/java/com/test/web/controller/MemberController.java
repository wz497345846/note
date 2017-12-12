package com.test.web.controller;

import com.test.pojo.Membermanage;
import com.test.pojo.MembermanageExample;
import com.test.service.MemberService;
import com.test.service.impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    public String createMember(){
        return "index";
    }

    /**
     * 删除会员
     */
    @RequestMapping("delMember")
    public String delMember(){
        return "index";
    }

    /**
     * 编辑会员
     */
    @RequestMapping("updateMember")
    public String updateMember(){
        return "index";
    }

}
