package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.Rating;
import com.rs.fullstackbookstoreweb.repository.RatingRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RatingService extends GenericServiceImpl<Rating, Integer> {
	public RatingService(RatingRepository repository) {
		super(repository);
	}
}
