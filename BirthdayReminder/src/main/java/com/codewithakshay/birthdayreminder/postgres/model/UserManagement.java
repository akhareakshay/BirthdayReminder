package com.codewithakshay.birthdayreminder.postgres.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(schema = "public", name = "user_management")
public class UserManagement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userid;

	@NotBlank
	@Column(name = "user_name")
	private String userName;

	@NotBlank
	@NotEmpty(message = "PLease enter password")
	private String password;

	@Column(name = "phone_number")
	private Long phoneNumber;

}
