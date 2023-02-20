package org.sda.beans;

import lombok.Setter;

/**
 * Configuration with java class itself
 */

@Setter
public class MyBean {
    private String name;

    public String sayHello() {
        return "Hello " + name + "!";
    }
}
