package com.jiwei.proxy.demo1;

//真实角色，房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
