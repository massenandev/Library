package com.library.service.convert;

import com.library.domain.Book;
import com.library.dto.BookDto;

public class BookConvert {
	
	public static Book convert(BookDto bookDto) {
		return new Book(bookDto.getIsbn(), bookDto.getAuthor(), bookDto.getTitle(), bookDto.getYear());
	}

}
