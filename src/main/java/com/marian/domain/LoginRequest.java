package com.marian.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class LoginRequest {
	public LoginRequest() {
		super();
	}
	private String email;
	private String password;
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

}
