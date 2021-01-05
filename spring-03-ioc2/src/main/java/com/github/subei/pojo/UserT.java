package com.github.subei.pojo;

public class UserT {
    private String name;

    public UserT(String name) {
        this.name = name;
    }

    public UserT() {
        System.out.println("UserT被创建了");
    }

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
