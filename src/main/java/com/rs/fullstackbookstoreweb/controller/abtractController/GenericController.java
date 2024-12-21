package com.rs.fullstackbookstoreweb.controller.abtractController;

import com.rs.fullstackbookstoreweb.services.abstractService.GenericServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


public abstract class GenericController<T, ID> {

	private static final Logger logger = LoggerFactory.getLogger(GenericController.class);

	private final GenericServiceImpl<T, ID> service;

	public GenericController(GenericServiceImpl<T, ID> service) {
		this.service = service;
	}

	// Thêm mới entity
	@PostMapping
	public ResponseEntity<T> create(@RequestBody T entity) {
		logger.info("Creating new entity: {}", entity); // Log thông tin khi tạo mới
		T savedEntity = service.save(entity);
		logger.info("Created new entity with ID: {}", savedEntity); // Log khi entity đã được tạo
		return ResponseEntity.ok(savedEntity);
	}

	@PutMapping("/{id}")
	public ResponseEntity<T> update(@PathVariable ID id, @RequestBody T entity) {
		logger.info("Updating entity with ID: {}", id); // Log thông tin khi cập nhật
		T updatedEntity = service.update(entity);
		logger.info("Updated entity with ID: {}", id); // Log khi entity đã được cập nhật
		return ResponseEntity.ok(updatedEntity);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable ID id) {
		logger.info("Deleting entity with ID: {}", id); // Log thông tin khi xóa
		service.delete(id);
		logger.info("Deleted entity with ID: {}", id); // Log khi entity đã bị xóa
		return ResponseEntity.noContent().build();
	}

	// Tìm entity theo ID
	@GetMapping("/{id}")
	public ResponseEntity<T> findById(@PathVariable ID id) {
		logger.info("Fetching entity with ID: {}", id); // Log thông tin khi tìm kiếm entity
		T entity = service.findById(id);
		if (entity == null) {
			logger.warn("Entity with ID: {} not found", id);
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(entity);
	}

	@GetMapping
	public ResponseEntity<Page<T>> findAll(Pageable pageable) {
		logger.info("Fetching all entities with pageable: {}", pageable); // Log thông tin khi truy vấn danh sách
		Page<T> page = service.findAll(pageable);
		if (page.isEmpty()) {
			logger.warn("No entities found for the given page request: {}", pageable);
			return ResponseEntity.noContent().build();
		}
		logger.info("Fetched {} entities", page.getTotalElements()); // Log số lượng entities đã lấy
		return ResponseEntity.ok(page);
	}
}