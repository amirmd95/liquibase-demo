package com.amir.liquibase.controller;

import com.amir.liquibase.entity.Book;
import com.amir.liquibase.service.BookAndAuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class BookController {
    private final BookAndAuthorService bookAndAuthorService;

    @GetMapping("/books")
    public List<Book> getBooks(){

        List<Book> allBooks = bookAndAuthorService.getAllBooks();
        return allBooks;

    }
}
