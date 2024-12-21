package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.Supplier;
import com.rs.fullstackbookstoreweb.repository.SupplierRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierService extends GenericServiceImpl<Supplier, Integer> {
	public SupplierService(SupplierRepository repository) {
		super(repository);
	}
}
