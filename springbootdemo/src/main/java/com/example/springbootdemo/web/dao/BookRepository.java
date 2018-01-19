package com.example.springbootdemo.web.dao;

import com.example.springbootdemo.web.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long>{

}
