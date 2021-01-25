package com.github.subei.demo3;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        // 代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();

        // 通过调用程序来处理角色，来处理我们要调用的接口对象！
        handler.setRent(host);

        Rent proxy = (Rent) handler.getProxy(); // 动态生成对应的代理类！

        proxy.rent();
    }
}


