package com.example.infraops_test.dennis_muriuki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    private final BooksRepository bookRepository;

    @Autowired
    public BooksService(BooksRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Books> getAllBooks() {
        return bookRepository.findAll();
    }
}
