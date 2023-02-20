package org.sda.configuration;

import org.sda.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Explicit Configuration with java class itself
 */
@Configuration // use always with java configurations
public class ApplicationConfiguration {

    @Bean // - this way Spring will take it automatically and run as a bean
    public MyBean myBean() {
        MyBean myBean = new MyBean();
        myBean.setName("Carolin");
        return myBean;
    }
}
