package com.amir.liquibase.service;

import com.amir.liquibase.entity.Book;
import com.amir.liquibase.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookAndAuthorService {
    private final BookRepository bookRepository;

    public List<Book> getAllBooks()
    {
        List<Book> books = bookRepository.findAll();
        return books;
    }
}
