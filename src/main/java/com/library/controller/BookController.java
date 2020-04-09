package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.domain.Book;
import com.library.dto.BookDto;
import com.library.service.BookService;

@RestController
@RequestMapping(value = "/api")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/save")
	public ResponseEntity<Book> saveBook(@RequestBody BookDto bookDto) {
		Book createBook = bookService.save(bookDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(createBook);
	}

}
