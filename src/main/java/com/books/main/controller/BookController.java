package com.books.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.main.model.BookModel;
import com.books.main.service.BookService;




@RestController
@RequestMapping("/api")
public class BookController {
	

	@Autowired
    private BookService bookservice;

    @GetMapping(value = "/books")
    public ResponseEntity<List<BookModel>> getAllBooks() {
        return new ResponseEntity<>(bookservice.getAllBooks(), HttpStatus.OK);
}
}
