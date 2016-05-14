package com.dvdat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JimmyDo on 5/14/2016.
 */
public class MainApp {
    public  static void main(String []args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld bean = context.getBean(HelloWorld.class);
        System.out.println(bean.getMessage());
    }
}
