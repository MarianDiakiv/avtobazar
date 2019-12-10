package com.marian.mapper;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.marian.domain.RegisterRequest;
import com.marian.entity.UserEntity;
import com.marian.entity.enumeration.Role;

public interface UserMapper {

	public static User toSecurityUser(UserEntity entity) {
		return new User(entity.getEmail(), entity.getPassword(), AuthorityUtils.createAuthorityList(String.valueOf(entity.getRole())));
	}
	public static UserEntity registerToUser(RegisterRequest request) {
		UserEntity	user = new UserEntity();
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setAge(request.getAge());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		user.setRole(Role.ROLE_USER);
		return user; 
	}
	
}
