package com.example.infraops_test.dennis_muriuki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")

public class BooksController {

    private final BooksService bookService;

    @Autowired
    public BooksController(BooksService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Books> getAllBooks() {
        return bookService.getAllBooks();
    }
}
