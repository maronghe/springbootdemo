package com.example.springbootdemo.web.service.Impl;

import com.example.springbootdemo.web.dao.BookRepository;
import com.example.springbootdemo.web.entity.Book;
import com.example.springbootdemo.web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getBookList() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updataByBookId(Long id, Book book) {
        book.setBookId(id);
        return bookRepository.save(book);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.delete(id);
    }
}
