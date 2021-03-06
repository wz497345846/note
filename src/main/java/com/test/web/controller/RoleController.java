package com.test.web.controller;

import com.test.dao.RolesMapper;
import com.test.pojo.Roles;
import com.test.pojo.RolesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    RolesMapper rolesMapper;

    @RequestMapping("/getAllRoles")
    @ResponseBody
    public List<Roles> getRoles(){
        RolesExample rolesExample=new RolesExample();
        RolesExample.Criteria criteria= rolesExample.createCriteria();
        criteria.getAllCriteria();
        return rolesMapper.selectByExample(rolesExample);
    }

    @RequestMapping("/saveRole")
    public String saveRole(){
        return "index";
    }

    @RequestMapping("/delRole")
    public String delRole(){
        return "index";
    }

    @RequestMapping("/updateRole")
    public String updateRole(){
        return "index";
    }
}
