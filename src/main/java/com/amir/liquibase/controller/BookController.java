package com.amir.liquibase.controller;

import com.amir.liquibase.entity.Book;
import com.amir.liquibase.repository.BookRepository;
import com.amir.liquibase.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks(){

        List<Book> allBooks = bookService.getAllBooks();
        return allBooks;

    }
}
