package com.anna0613.spring_aop_demo1;

/**
 * Created by Administrator on 2017/2/10.
 */
public class CarLogger {
    public void beforeRun(){
        System.out.println("car is going to run");
    }

    public void afterRun(){
        System.out.println("car is running");
    }
}
