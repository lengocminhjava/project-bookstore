package com.rs.fullstackbookstoreweb.repository;

import com.rs.fullstackbookstoreweb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
