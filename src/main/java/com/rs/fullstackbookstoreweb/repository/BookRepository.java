package com.rs.fullstackbookstoreweb.repository;

import com.rs.fullstackbookstoreweb.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
