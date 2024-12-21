package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.Order;
import com.rs.fullstackbookstoreweb.repository.OrderRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends GenericServiceImpl<Order,Integer> {
	public OrderService(OrderRepository repository) {
		super(repository);
	}
}
