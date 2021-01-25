package com.github.subei.Demo4;

import com.github.subei.demo2.UserService;
import com.github.subei.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置要代理的对象
        pih.setTarget(userService);
        // 动态生成代理类！
        UserService proxy = (UserService)pih.getProxy();

        proxy.add();
    }
}
