package com.rs.fullstackbookstoreweb.repository;

import com.rs.fullstackbookstoreweb.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
