package org.sda.beans;

import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * Basic bean model
 */
@Setter
@Service("myBean")
public class MyBean {
    private String name;
    public String sayHello() {
        return "Hello " + name + "!";
    }
}
