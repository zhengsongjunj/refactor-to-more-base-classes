package com.github.hcsp.inheritance;

public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
