package com.github.subei.demo;

public class Client {
    public static void main(String[] args) {
        // 房东要租房子
        Host host = new Host();
//        host.rent();
        // 代理，中介帮房东租房子，但是呢？代理角一般会有一些附属操作！
        Proxy proxy = new Proxy(host);
        // 直接找中介租房
        proxy.rent();
    }
}
