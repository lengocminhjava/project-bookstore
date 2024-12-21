package com.rs.fullstackbookstoreweb.controller;


import com.rs.fullstackbookstoreweb.controller.abtractController.GenericController;
import com.rs.fullstackbookstoreweb.entities.AgeGroup;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agegroups")
public class AgeGroupController extends GenericController<AgeGroup,Integer> {
	public AgeGroupController(GenericServiceImpl<AgeGroup, Integer> service) {
		super(service);
	}
}
