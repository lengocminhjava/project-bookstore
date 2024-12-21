package com.rs.fullstackbookstoreweb.services.abstractService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public abstract class GenericServiceImpl<T, ID> implements ServiceInterFace<T, ID> {
	private final JpaRepository<T, ID> repository;

	public GenericServiceImpl(JpaRepository<T, ID> repository) {
		this.repository = repository;
	}

	@Override
	public T save(T entity) {
		return repository.save(entity);
	}

	@Override
	public T update(T entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(ID id) {
		repository.deleteById(id);
	}

	@Override
	public T findById(ID id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}
}
