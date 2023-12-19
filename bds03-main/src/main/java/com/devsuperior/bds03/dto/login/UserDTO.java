package com.devsuperior.bds03.dto.login;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.devsuperior.bds03.entities.login.Role;
import com.devsuperior.bds03.entities.login.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	@NotBlank(message = "Nome é obrigatório") // NotBlank valida espaços em branco e null
	private String firstName;
	private String lastName;
	@Email (message = "Digite um e-mail válido")
	private String email;
	private String password;
	
	private Set<Role> roles = new HashSet<Role>();
	
	public UserDTO() {}

	public UserDTO(Long id, String firstName, String lastName, String email, String password, Set<Role> roles) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	
	public UserDTO(User userEntity) {
		this.id = userEntity.getId();
		this.firstName = userEntity.getFirstName();
		this.lastName = userEntity.getLastName();
		this.email = userEntity.getEmail();
	}
	
	
}
