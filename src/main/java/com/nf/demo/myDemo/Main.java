package com.nf.demo.myDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CatDAO cat = context.getBean(CatDAO.class);

        //添加一个
        boolean bool = cat.insertCat(new Cat("花猫", 3, "这是一只会唱歌的花猫。。。"));
        System.out.println(bool);

        //查询单个
        Map<String, Object> stringObjectMap = cat.selectById(1);
        System.out.println(stringObjectMap);

        //查询所有
        List<Map<String, Object>> maps = cat.selectAll();
        System.out.println(maps);

    }

}
