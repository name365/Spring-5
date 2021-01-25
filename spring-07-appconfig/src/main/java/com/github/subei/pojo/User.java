package com.github.subei.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // 将这个类标注为Spring的一个组件，放到容器中！
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("KANGSHIFU") //属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}