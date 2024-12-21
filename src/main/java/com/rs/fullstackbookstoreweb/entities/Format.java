package com.rs.fullstackbookstoreweb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "formats")
@AllArgsConstructor
@NoArgsConstructor
public class Format {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, unique = true)
	@JsonProperty("name")
	private String name;

	@ManyToMany(mappedBy = "formats")
	@JsonIgnore
	private List<Book> books = new ArrayList<>();
}