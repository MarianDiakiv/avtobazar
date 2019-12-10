package com.marian.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.marian.entity.enumeration.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user", indexes = @Index(columnList = "email, last_name"))
public class UserEntity extends BaseEntity {
	
public UserEntity() {
		super();
	}

//	public UserEntity(String email, String password, String firstName, String lastName, int age, String imagePath,
//			Role role) {
//		super();
//		this.email = email;
//		this.password = password;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
//		this.imagePath = imagePath;
//		this.role = role;
//	}
	private String email;
	private String password;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	private int age;
	
	@Column(name = "image_path")
	private String imagePath;
	@Enumerated(EnumType.ORDINAL)
	private Role role;
	
	private String token;
	@Column(name="is_activated")
	private boolean isActivated;
	
	@OneToMany(mappedBy="user", cascade= {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	private List<Custom> custom;

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

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public List<Custom> getCustom() {
		return custom;
	}

	public void setCustom(List<Custom> custom) {
		this.custom = custom;
	}
}
