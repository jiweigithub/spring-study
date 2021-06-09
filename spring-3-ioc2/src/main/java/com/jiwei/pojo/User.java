package com.jiwei.pojo;

public class User {

    private User2 user2;

    public void setUser2(User2 user2) {
        this.user2 = user2;
    }

    public User() {
        System.out.println("User的无参构造");
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
