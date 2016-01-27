package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.Users;

public interface UsersDao extends JpaRepository<Users, String> {

	
}
