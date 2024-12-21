package com.rs.fullstackbookstoreweb.controller;

import com.rs.fullstackbookstoreweb.controller.abtractController.GenericController;
import com.rs.fullstackbookstoreweb.entities.OrderDetail;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderdetail")
public class OrderDetailController extends GenericController<OrderDetail,Integer> {
	public OrderDetailController(GenericServiceImpl<OrderDetail, Integer> service) {
		super(service);
	}
}
