package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.Format;
import com.rs.fullstackbookstoreweb.repository.FormatRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class FormatService extends GenericServiceImpl<Format, Integer> {
	public FormatService(FormatRepository repository) {
		super(repository);
	}
}
