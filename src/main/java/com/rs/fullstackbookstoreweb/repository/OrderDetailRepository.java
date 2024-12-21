package com.rs.fullstackbookstoreweb.repository;

import com.rs.fullstackbookstoreweb.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
}
