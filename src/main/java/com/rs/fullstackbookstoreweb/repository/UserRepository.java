package com.rs.fullstackbookstoreweb.repository;

import com.rs.fullstackbookstoreweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
