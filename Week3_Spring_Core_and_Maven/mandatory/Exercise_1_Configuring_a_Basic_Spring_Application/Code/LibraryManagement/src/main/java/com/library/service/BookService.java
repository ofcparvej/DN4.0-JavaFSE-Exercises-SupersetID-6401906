package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
        // Hardcoded dependency
        System.out.println("No Dependency Injection");
        this.bookRepository = new BookRepository();
    }

    public void addBook(String title) {
        System.out.println("BookService: Adding book");
        bookRepository.saveBook(title);
    }
}
