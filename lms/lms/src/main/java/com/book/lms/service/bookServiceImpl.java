package com.book.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.lms.entity.Book;
import com.book.lms.repository.BookRepository;
@Service
public class bookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        
        return bookRepository.save(book);
    }

}
