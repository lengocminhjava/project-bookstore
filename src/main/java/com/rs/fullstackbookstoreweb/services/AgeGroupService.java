package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.AgeGroup;
import com.rs.fullstackbookstoreweb.repository.AgeGroupRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AgeGroupService extends GenericServiceImpl<AgeGroup, Integer> {

	public AgeGroupService(AgeGroupRepository repository) {
		super(repository);
	}

}
