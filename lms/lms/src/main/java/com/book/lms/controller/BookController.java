package com.book.lms.controller;

import org.springframework.web.bind.annotation.RestController;

import com.book.lms.entity.Book;
import com.book.lms.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        System.out.println("Book controller");
        System.out.println(book);
        bookService.addBook(book);
        return null;
    }
    

}
