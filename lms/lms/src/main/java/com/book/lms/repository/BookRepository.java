package com.book.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.lms.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
