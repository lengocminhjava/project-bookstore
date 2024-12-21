package com.rs.fullstackbookstoreweb.controller;

import com.rs.fullstackbookstoreweb.controller.abtractController.GenericController;
import com.rs.fullstackbookstoreweb.entities.Order;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController extends GenericController<Order,Integer> {
	public OrderController(GenericServiceImpl<Order, Integer> service) {
		super(service);
	}
}
