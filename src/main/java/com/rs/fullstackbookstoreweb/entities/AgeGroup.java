package com.rs.fullstackbookstoreweb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "age_groups")
@AllArgsConstructor
@NoArgsConstructor
public class AgeGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "age_range", nullable = false, unique = true)
	@JsonProperty("ageRange")
	private String ageRange;
	@OneToMany(mappedBy = "ageGroup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Book> books;
}
