package com.rs.fullstackbookstoreweb.repository;

import com.rs.fullstackbookstoreweb.entities.BookImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookImageRepository extends JpaRepository<BookImage, Integer> {
}
