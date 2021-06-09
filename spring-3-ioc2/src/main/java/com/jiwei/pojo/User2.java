package com.jiwei.pojo;

public class User2 {

    public User2(String name) {
        System.out.println("User2的有参构造");
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }

}
