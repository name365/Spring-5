package com.github.subei.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于  <bean id="user" class="com.github.subei.pojo.User"/>
// @Component 组件
@Component
//@Scope("singleton") //单例模式
@Scope("prototype") //原型模式
public class User {

    // 相当于  <property name="name" value="subeiLY"/>
    @Value("subeiLY")
    public String name;

    public void setName(String name) {
        this.name = name;
    }
}