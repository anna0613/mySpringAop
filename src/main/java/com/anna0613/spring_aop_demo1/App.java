package com.anna0613.spring_aop_demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/2/10.
 */
public class App {
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Car car=(Car) context.getBean("car");
        car.go();
    }
}
