package com.offcn.thymeleaf.controller;

import com.offcn.thymeleaf.demo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class FirstThymeleafController {
    @GetMapping("/index")
    public String indexPage(){
        System.out.println("进入了控制层11111111111");
        return "index";
    }

    @GetMapping("/index2")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        User u = new User();
        u.setId(1);
        u.setName("优就业");
        u.setAge(18);

        Map<String,Object> map=new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("message", message);
        model.addAttribute("user", u);
        model.addAttribute("src", map);
        return "index2";
    }

    @GetMapping("/index3")
    public String index3page(Model model) {
        List<User> list=new ArrayList<User>();
        User u1 = new User();
        u1.setId(1);
        u1.setName("优就业");
        u1.setAge(18);
        list.add(u1);

        User u2 = new User();
        u2.setId(2);
        u2.setName("中公教育");
        u2.setAge(28);
        list.add(u2);
        User u3 = new User();
        u3.setId(3);
        u3.setName("IT先锋");
        u3.setAge(88);
        list.add(u3);

        User u4 = new User();
        u4.setId(4);
        u4.setName("JAVA第一");
        u4.setAge(888);
        list.add(u4);

        model.addAttribute("userList", list);
        return "index3";
    }
    @GetMapping("/index4")
    public String index4page(Model model) {
        model.addAttribute("userName", "优就业");
        model.addAttribute("href", "http://www.ujiuye.com");
        return "index4";
    }
    @GetMapping("/index5")
    public String index5Page(Model model) {

        model.addAttribute("result", "yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");

        return "index5";
    }
    @GetMapping("/index6")
    public String index6Page(Model model) {



        return "index6";
    }

    @GetMapping("/index7")
    public String index7Page(Model model) {
         //日期
        Date date = new Date();
        //字符串
        String str1 = "阿达阿萨德11111111"+"阿萨德222222";
        String str2 = "阿达阿萨德11111"+"阿萨德11111";
        //数字
        double price = 3.1415926;
        model.addAttribute("date",date);
        model.addAttribute("str1",str1);
        model.addAttribute("str2",str2);
        model.addAttribute("price",price);

        return "index7";
    }
}
