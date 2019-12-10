package com.marian.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.marian.validator.CheckPasswordsMatch;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@CheckPasswordsMatch
public class RegisterRequest {

	public RegisterRequest() {
		super();
	}
	@Pattern(regexp = "[a-zA-Z].+[a-zA-Z0-9+.]+@[A-Za-z]{2,5}+.[A-Za-z]{2,4}$", message = "Typed email has not correct format")
	@NotEmpty private String email;
	@NotEmpty private String firstName;
	@NotEmpty private String lastName;
	@NotEmpty private int age;
	@NotNull private String password;
	@NotEmpty private String passwordConfirmation;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}
}
