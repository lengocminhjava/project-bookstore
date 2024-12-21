package com.rs.fullstackbookstoreweb.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rs.fullstackbookstoreweb.entities.enums.RoleUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, unique = true)
	@JsonProperty("username")
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false, unique = true)
	private String email;

	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private RoleUser role = RoleUser.CUSTOMER;

	@CreatedDate
	@Column(name = "create_at", nullable = false)
	private LocalDateTime createdAt;

}