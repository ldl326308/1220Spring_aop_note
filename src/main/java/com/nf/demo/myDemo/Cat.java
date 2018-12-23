package com.nf.demo.myDemo;

public class Cat {

    private int id;

    private String name;

    private int age;

    private String describe;


    public Cat() {
    }

    public Cat(String name, int age, String describe) {
        this.name = name;
        this.age = age;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id='"+ id +'\''+
                "name='" + name + '\'' +
                ", age=" + age +
                ", describe='" + describe + '\'' +
                '}';
    }
}
