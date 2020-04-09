package com.library.dto;

import javax.validation.constraints.NotNull;

public class BookDto {
	
	@NotNull(message = "ISBN is required!")
	private String isbn;
	@NotNull(message = "Title is required!")
	private String title;
	@NotNull(message = "Author is required!")
	private String author;
	@NotNull(message = "Year is required!")
	private String year;

	
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
	
	
	@Override
	public String toString() {
		return "BookDto [isbn=" + isbn + ", title=" + title + ", author=" + author + ", year=" + year + "]";
	}

}
