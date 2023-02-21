package org.sda;

import org.sda.beans.MyBean;
import org.sda.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author carolinrandala
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();

        MyBean myBean = applicationContext.getBean(MyBean.class);
        System.out.println(myBean.favouriteBook());

    }
}