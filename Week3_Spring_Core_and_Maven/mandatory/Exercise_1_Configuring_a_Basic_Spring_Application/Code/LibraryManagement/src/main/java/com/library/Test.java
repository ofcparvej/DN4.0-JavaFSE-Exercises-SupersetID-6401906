package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  //load xml

        BookService bookService = new BookService(); // book service bean
        bookService.addBook("Digital Nurture Handbook");
    }
}
