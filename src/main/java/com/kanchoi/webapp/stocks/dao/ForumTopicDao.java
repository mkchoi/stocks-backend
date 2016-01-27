package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.ForumTopic;

public interface ForumTopicDao extends JpaRepository<ForumTopic, Long> {


}
