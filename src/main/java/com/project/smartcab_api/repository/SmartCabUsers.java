package com.project.smartcab_api.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name="users")
public class SmartCabUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false, unique = true, length= 45)
	private String email;
	
	@Column(nullable = false , length =20)
	private String password;
	
	@Column(nullable = false , length =20)
	private String confirmPassword;
	
	@Column(name= "first_name" , nullable = false, length= 20 ) 
	private String firstname;
	
	@Column(name="last_name", nullable = false, length = 20)
	private String lastname;
	
	@Column(name="phone_number", nullable = false, length = 20)
	private String phno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
} 
