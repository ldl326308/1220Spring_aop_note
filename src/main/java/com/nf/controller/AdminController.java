package com.nf.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
public class AdminController {

    @RequestMapping(value = "/login/{name}/{password}" , method = RequestMethod.GET , produces = "application/json;charset=utf-8")
        public String login(@PathVariable("name") String name, @PathVariable("password") String password,HttpSession session){
            session.setAttribute("name",name);
            session.setAttribute("password",password);
            //login2();
            return "成功";

    }

    public void login2(){
        System.out.println("kkkkkkk");
    }

    @Autowired
    private WebApplicationContext webApplicationContext;

    /**
     * 查看 Spring 容器
     * @return
     */
    @GetMapping(value = "/getIoc")
    public HashMap<String,String[]> getIoc(){
        return new HashMap<String, String[]>(){{
            put("子容器",webApplicationContext.getBeanDefinitionNames());
            put("父容器",webApplicationContext.getParent().getBeanDefinitionNames());
        }};
    }




}
