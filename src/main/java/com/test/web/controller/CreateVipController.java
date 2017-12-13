package com.test.web.controller;

import com.test.pojo.MemberType;
import com.test.pojo.Membermanage;
import com.test.service.impl.MemberServiceImpl;
import com.test.service.impl.MemberTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class CreateVipController {
    @Autowired
    private MemberServiceImpl memberServiceImpl;

   @RequestMapping("createVip")
   public Map createVip(Membermanage membermanage, MemberType memberType){
       List<MemberType> list=new MemberTypeServiceImpl().getAllVipTypesService();
       for (MemberType m :list) {
           if (memberType.getMembertypeId()==m.getMembertypeId()){
               Date today=new Date();
               membermanage.setStarttime(today);
               Calendar calendar = new GregorianCalendar();
               calendar.setTime(today);
               calendar.add(calendar.MONTH,memberType.getMonthTime());
               membermanage.setEndtime(calendar.getTime());
           }
       }
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
