package com.library.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "TB_BOOK")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CD_BOOK", nullable = false)
	private long id;
	
	@Column(name = "ISBN", nullable = false)
	private String isbn;
	
	@Column(name = "TITLE", nullable = false)
	private String title;
	
	@Column(name = "AUTHOR", nullable = false)
	private String author;
	
	@Column(name = "YEAR", nullable = false)
	private String year;

	@Column(name = "REGISTRATION_DATE", nullable = false)
	private LocalDateTime registrationDt;
	
	@Column(name = "UPDATE_DATE", nullable = false)
	private LocalDateTime updateDt;
	
	@Column(name = "ACTIVE", nullable = false)
	private boolean active;
	
	
	@PreUpdate
	public void preUpdate() {
		updateDt = LocalDateTime.now();
	}

	@PrePersist
	public void prePersist() {
		updateDt = LocalDateTime.now();
		registrationDt = LocalDateTime.now();
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", year=" + year
				+ ", registrationDt=" + registrationDt + ", updateDt=" + updateDt + ", active=" + active + "]";
	}
}
