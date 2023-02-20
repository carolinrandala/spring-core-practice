package org.sda.beans;

import lombok.Setter;
import org.sda.interfaces.BeanName;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Setter
@Component // if you register any class as a component that class will be executed automatically
public class MyBean {
    private BeanName name;

    public MyBean(@Qualifier("firstName") BeanName name) { // setting a qualifier inside ()
        this.name = name;
    }

    public String sayHello() {
        return "Hello " + name.getName() + "!";
    }
}
