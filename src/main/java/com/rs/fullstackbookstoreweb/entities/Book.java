package com.rs.fullstackbookstoreweb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String title;

	private String description;

	@Column(nullable = false)
	private BigDecimal price;

	@Column(name = "stock_quantity", nullable = false)
	@JsonProperty("stockQuantity")
	private Integer stockQuantity;

	@Column(name = "discount", nullable = false)
	private BigDecimal discount = BigDecimal.ZERO;

	@Column(name = "image_url", nullable = false)
	private String imageUrl;

	@ManyToOne
	@JsonProperty("category")
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

	@ManyToOne
	@JsonProperty("language")
	@JoinColumn(name = "language_id", nullable = false)
	private Language language;

	@ManyToOne
	@JsonProperty("ageGroup")
	@JoinColumn(name = "age_group_id", nullable = false)
	private AgeGroup ageGroup;

	@CreatedDate
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;

	@LastModifiedDate
	@Column(name = "update_at", nullable = false)
	private LocalDateTime updatedAt;
	@ManyToMany
	@JoinTable(
			name = "Book_Formats",
			joinColumns = @JoinColumn(name = "book_id"),
			inverseJoinColumns = @JoinColumn(name = "format_id")
	)
	@JsonIgnore
	private List<Format> formats = new ArrayList<>();
	@ManyToMany
	@JoinTable(
			name = "Book_Suppliers",
			joinColumns = @JoinColumn(name = "book_id"),
			inverseJoinColumns = @JoinColumn(name = "supplier_id")
	)
	@JsonIgnore
	private List<Supplier> suppliers = new ArrayList<>();
}