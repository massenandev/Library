package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long>{


}
