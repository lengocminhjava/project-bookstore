package com.rs.fullstackbookstoreweb.controller;

import com.rs.fullstackbookstoreweb.entities.BookImage;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookimage")
public class BookImageController extends GenericServiceImpl<BookImage,Integer> {
	public BookImageController(JpaRepository<BookImage, Integer> repository) {
		super(repository);
	}
}
