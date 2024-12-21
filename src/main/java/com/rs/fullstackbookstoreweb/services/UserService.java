package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.User;
import com.rs.fullstackbookstoreweb.repository.UserRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericServiceImpl<User, Integer> {
	public UserService(UserRepository repository) {
		super(repository);
	}
}
