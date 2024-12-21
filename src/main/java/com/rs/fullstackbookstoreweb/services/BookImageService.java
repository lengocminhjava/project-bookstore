package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.BookImage;
import com.rs.fullstackbookstoreweb.repository.BookImageRepository;
import com.rs.fullstackbookstoreweb.repository.BookRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BookImageService extends GenericServiceImpl<BookImage, Integer> {

	public BookImageService(BookImageRepository repository) {
		super(repository);
	}
}
