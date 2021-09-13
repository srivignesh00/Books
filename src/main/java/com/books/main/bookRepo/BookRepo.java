package com.books.main.bookRepo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.books.main.model.BookModel;

public interface BookRepo extends MongoRepository<BookModel, String> {

	

}
