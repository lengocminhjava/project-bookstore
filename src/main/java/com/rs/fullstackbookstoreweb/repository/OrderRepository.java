package com.rs.fullstackbookstoreweb.repository;

import com.rs.fullstackbookstoreweb.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
