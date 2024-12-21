package com.rs.fullstackbookstoreweb.controller;

import com.rs.fullstackbookstoreweb.controller.abtractController.GenericController;
import com.rs.fullstackbookstoreweb.entities.Category;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController extends GenericController<Category,Integer> {
	public CategoryController(GenericServiceImpl<Category, Integer> service) {
		super(service);
	}
}
