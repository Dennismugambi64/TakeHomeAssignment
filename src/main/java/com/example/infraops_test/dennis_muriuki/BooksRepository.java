package com.example.infraops_test.dennis_muriuki;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepository extends MongoRepository<Books, String> {
}
