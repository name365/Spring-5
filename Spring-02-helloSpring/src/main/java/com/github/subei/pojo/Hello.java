package com.github.subei.pojo;

public class Hello {
    private String src;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "src='" + src + '\'' +
                '}';
    }
}
