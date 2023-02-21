package org.sda.beans;


import org.sda.interfaces.BeanBook;
import org.springframework.stereotype.Component;

@Component(value = "bookName")
public class BookName implements BeanBook {
    private String name;

    public BookName() {
        this.name = "The Prophet";
    }

    @Override
    public String getBook() {
        return this.name;
    }
}
