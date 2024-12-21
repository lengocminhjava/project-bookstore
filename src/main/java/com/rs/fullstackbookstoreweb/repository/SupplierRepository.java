package com.rs.fullstackbookstoreweb.repository;

import com.rs.fullstackbookstoreweb.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
