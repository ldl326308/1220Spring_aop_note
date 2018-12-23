package com.nf.demo1.myDemo;

import com.nf.demo1.myDemo.entity.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CatService catService = context.getBean(CatService.class);
        Cat cat = catService.findByName("花猫");
        System.out.println(cat);

        System.out.println("===================查询所有==================");

        List<Cat> all = catService.getAll();
        System.out.println(all);


    }

}
