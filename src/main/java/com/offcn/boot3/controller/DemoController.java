package com.offcn.boot3.controller;


import com.offcn.boot3.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class DemoController {

    //新增分支+++++++++++++++=====
    //isimmdocodo


    @RequestMapping("/index")
    public String index(Model model){

        String str1 = "hello thymeleaf";
        model.addAttribute("str1",str1);

        return "index";

    }

    @RequestMapping("index1")
    public String in2(Model model){

        User user = new User(1,"小明",18);
       model.addAttribute(user);

        Map map = new HashMap();
        map.put("img1","1.jpg");
        map.put("img2","2.jpg");

        model.addAttribute("map", map);

        List<User> list = new ArrayList<>();
        list.add(new User(1, "小红1",18));
        list.add(new User(2, "小红2",18));
        list.add(new User(3, "小红3",18));
        list.add(new User(4, "小红4",18));

        model.addAttribute("list",list);

        model.addAttribute("flag","yes");
        model.addAttribute("flags","yes");

        model.addAttribute("menu","manager");

        model.addAttribute("date",new Date());

        double price = 222.3334421;
        model.addAttribute("price",price);

        String st = "中秋节放假通知来了！下半年还有这些假可以休\n" +
                "中国政府网 2019-08-25 17:44\n" +
                "\n" +
                "今年中秋节什么时候放假?中秋节高速公路" +
                "小客车是否免收通行费?中秋节加班费怎么计算?国办：" +
                "中秋节9月13日放假根据《国务院办公厅关于2019年部" +
                "分节假日安排的通知》，" +
                "2019年中秋节9月13日放假，与周末连休。";
        model.addAttribute("st", st);






        return "index1";
    }



}
