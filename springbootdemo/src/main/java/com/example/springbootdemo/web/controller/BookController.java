package com.example.springbootdemo.web.controller;

import com.example.springbootdemo.web.entity.Book;
import com.example.springbootdemo.web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@ResponseBody
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    static Map<Long,Book> map = new HashMap<>();
    static {
        for (int i = 0; i < 10; i++) {
            Long id = i + 1L;
            map.put(id,new Book(id,"BookName"+id,"0411-"+id,"晃动出版社"+id));
        }
    }
    @GetMapping
    public List<Book> getBookList(){
        List<Book> list = bookService.getBookList();
        return list;
    }

    @GetMapping(value = "{id}")
    public Book getBookById(@PathVariable("id") Long id){
        return bookService.getBookById(id);
    }

    @DeleteMapping("{id}")
    public int removeBookById(@PathVariable("id") Long id){
        bookService.deleteBookById(id);
        return 1;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PutMapping("{id}")
    public Book updateBook(@PathVariable("id")Long id,@RequestBody Book book){
        return bookService.updataByBookId(id,book);
    }
}
