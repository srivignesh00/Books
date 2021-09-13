package com.books.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.books.main.bookRepo.BookRepo;
import com.books.main.model.BookModel;

@Service
public class BookServiceImpl implements BookService {
	 @Autowired
	    private BookRepo bookRepo;

	    @Override
	    public List<BookModel> getAllBooks() {
	        try {

	            List<BookModel> books = bookRepo.findAll();

	            if (books == null)
	                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Records not found!");

	            return books;

	        } catch (Exception e) {
	            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
	        }
	    }
}
