package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

@Component(value = "lastName") // to register class as a component
public class SecondName implements BeanName {
    private String name;

    public SecondName() {
        this.name = "Randala";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
