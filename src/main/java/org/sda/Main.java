package org.sda;

import org.sda.beans.MyBean;
import org.sda.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author carolinrandala
 */
public class Main {
    public static void main(String[] args) {
        // Importing java application configuration
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh(); // for a safety always refresh configuration

        MyBean myBean = applicationContext.getBean(MyBean.class);
        System.out.println(myBean.sayHello());

        myBean.setName("John");
        System.out.println(myBean.sayHello());
    }
}