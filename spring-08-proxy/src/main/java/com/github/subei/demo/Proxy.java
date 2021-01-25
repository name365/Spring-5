package com.github.subei.demo;

public class Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent(){
        seeHouse();
        host.rent();
        contract();
        fare();
    }

    // 看房
    public void seeHouse(){
        System.out.println("中介带你看房！");
    }

    // 收中介费
    public void fare(){
        System.out.println("收中介费！");
    }

    // 签合同
    public void contract(){
        System.out.println("和你签合同！");
    }
}
