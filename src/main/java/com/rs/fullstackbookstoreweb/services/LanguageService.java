package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.Language;
import com.rs.fullstackbookstoreweb.repository.LanguageRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LanguageService extends GenericServiceImpl<Language,Integer> {
	public LanguageService(LanguageRepository repository) {
		super(repository);
	}
}
