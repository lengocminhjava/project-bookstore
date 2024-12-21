package com.rs.fullstackbookstoreweb.controller;

import com.rs.fullstackbookstoreweb.controller.abtractController.GenericController;
import com.rs.fullstackbookstoreweb.entities.Language;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/language")
public class LanguageController extends GenericController<Language,Integer> {
	public LanguageController(GenericServiceImpl<Language, Integer> service) {
		super(service);
	}
}
