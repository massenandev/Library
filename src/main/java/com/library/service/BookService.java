package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.domain.Book;
import com.library.dto.BookDto;
import com.library.repository.BookRepository;
import com.library.service.convert.BookConvert;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	public Book save(BookDto bookDto) {
		Book book = BookConvert.convert(bookDto);
		return bookRepository.saveAndFlush(book);
	}
	
	

}
