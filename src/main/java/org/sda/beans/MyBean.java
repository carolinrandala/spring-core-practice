package org.sda.beans;

import lombok.Setter;
import org.sda.interfaces.BeanBook;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Setter
@Component
public class MyBean {

    private BeanBook name;

    public MyBean(@Qualifier("bookName")BeanBook book) {
        this.name = book;
    }

    public String favouriteBook() {
        return "Book: '" + name.getBook() + "'";
    }
}
