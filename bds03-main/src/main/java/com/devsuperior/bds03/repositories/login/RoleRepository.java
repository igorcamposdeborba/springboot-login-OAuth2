package com.devsuperior.bds03.repositories.login;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds03.entities.login.User;

public interface RoleRepository extends JpaRepository<User, Long> {

}
