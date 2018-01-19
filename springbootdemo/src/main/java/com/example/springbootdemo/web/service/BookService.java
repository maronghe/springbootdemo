package com.example.springbootdemo.web.service;

import com.example.springbootdemo.web.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getBookList();

    Book getBookById(Long id);

    Book addBook(Book book);

    Book updataByBookId(Long id,Book book);

    void deleteBookById(Long id);

}
