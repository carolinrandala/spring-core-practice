package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

@Component(value = "firstName") // to register class as a component
public class FirstName implements BeanName {
    private String name;

    public FirstName() {
        this.name = "Carolin";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
