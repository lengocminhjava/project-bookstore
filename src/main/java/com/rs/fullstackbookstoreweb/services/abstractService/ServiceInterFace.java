package com.rs.fullstackbookstoreweb.services.abstractService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ServiceInterFace<T, ID> {

	T save(T entity);

	T update(T entity);

	void delete(ID id);

	T findById(ID id);

	Page<T> findAll(Pageable pageable);
}
