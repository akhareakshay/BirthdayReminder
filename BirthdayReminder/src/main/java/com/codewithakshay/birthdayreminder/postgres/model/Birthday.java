package com.codewithakshay.birthdayreminder.postgres.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "birthday", schema = "public")
public class Birthday {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long birthdayId;
	@Column(name = "contact_number")
	private Long contactNumber;
	private String name;
	@Column(name = "email_id")
	private String emailId;
	
	private String Address;
	private String relation;
	private String gender;
	private Date date;

}
