package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.Category;
import com.rs.fullstackbookstoreweb.repository.CategoryRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends GenericServiceImpl<Category, Integer> {
	public CategoryService(CategoryRepository repository) {
		super(repository);
	}
}
