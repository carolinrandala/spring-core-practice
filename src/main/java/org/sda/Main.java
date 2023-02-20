package org.sda;

import org.sda.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Importing the configuration
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Calling my bean (using typecasting)
        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean.sayHello());

        myBean.setName("John");
        System.out.println(myBean.sayHello());
    }
}