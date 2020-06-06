package com.library.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.library.domain.Book;

public class BookDto {

	private Long id;
	private String isbn;
	private String title;
	private String author;
	private String year;
	private LocalDateTime registrationDt;
	private LocalDateTime updateDt;
	private boolean active;

	public static Book parse(BookDto bookDto) {
		Book b = new Book();
		b.setIsbn(bookDto.getIsbn());
		b.setTitle(bookDto.getTitle());
		b.setAuthor(bookDto.getAuthor());
		b.setYear(bookDto.getYear());
		b.setRegistrationDt(bookDto.getRegistrationDt());
		b.setUpdateDt(bookDto.getUpdateDt());
		b.setActive(true);
		return b;
	}

	public static List<BookDto> parse(List<Book> books) {
		List<BookDto> bks = new ArrayList<BookDto>();
		books.forEach(b -> bks.add(parse(b)));
		return bks;
	}

	public static BookDto parse(Book book) {
		BookDto dto = new BookDto();
		dto.setIsbn(book.getIsbn());
		dto.setTitle(book.getTitle());
		dto.setAuthor(book.getAuthor());
		dto.setYear(book.getYear());
		dto.setRegistrationDt(book.getRegistrationDt());
		dto.setUpdateDt(book.getUpdateDt());
		dto.setActive(book.isActive());
		return dto;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getRegistrationDt() {
		return registrationDt;
	}

	public void setRegistrationDt(LocalDateTime registrationDt) {
		this.registrationDt = registrationDt;
	}

	public LocalDateTime getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(LocalDateTime updateDt) {
		this.updateDt = updateDt;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "BookDto [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", year=" + year
				+ ", registrationDt=" + registrationDt + ", updateDt=" + updateDt + ", active=" + active + "]";
	}
}
