package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.library.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	@Query("SELECT b FROM Book b WHERE b.id = ?1 AND b.active = ?2")
	Book findById(Long id, boolean active);

	@Transactional
	@Modifying
	@Query("UPDATE Book b SET b.active = ?1 WHERE b.id = ?2")
	public void updateStatus( boolean active, Long id);


}
