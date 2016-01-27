package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.Authorities;

public interface AuthoritiesDao extends JpaRepository<Authorities, String> {
	
}
