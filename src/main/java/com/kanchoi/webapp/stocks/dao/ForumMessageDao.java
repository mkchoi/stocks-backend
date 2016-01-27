package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.ForumMessage;

public interface ForumMessageDao extends JpaRepository<ForumMessage, Long> {

	
}
