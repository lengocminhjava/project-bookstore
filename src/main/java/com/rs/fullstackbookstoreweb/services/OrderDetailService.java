package com.rs.fullstackbookstoreweb.services;

import com.rs.fullstackbookstoreweb.entities.Order;
import com.rs.fullstackbookstoreweb.entities.OrderDetail;
import com.rs.fullstackbookstoreweb.repository.OrderDetailRepository;
import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService extends GenericServiceImpl<OrderDetail,Integer> {
	public OrderDetailService(OrderDetailRepository repository) {
		super(repository);
	}
}
