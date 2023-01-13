package com.tcs.mvc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_data")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	@Column(nullable = false,unique = true,length = 45)
	private String email;
	
	@Column(nullable = false,length = 64)
	private String password; 
	
	private String firstName;
	
	private String lastName;
}