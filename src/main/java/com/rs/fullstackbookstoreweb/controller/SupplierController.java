package com.rs.fullstackbookstoreweb.controller;

import com.rs.fullstackbookstoreweb.controller.abtractController.GenericController;
import com.rs.fullstackbookstoreweb.entities.Supplier;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController extends GenericController<Supplier,Integer> {
	public SupplierController(GenericServiceImpl<Supplier, Integer> service) {
		super(service);
	}
}
