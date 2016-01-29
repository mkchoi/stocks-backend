package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kanchoi.webapp.stocks.dao.ForumMessageDao;

@Service("forumService")
@Transactional(value = "transactionManager", rollbackFor = Throwable.class)
public class ForumServiceImpl implements ForumService {
	private static Log log = LogFactory.getLog(ForumServiceImpl.class);

	@Autowired
	@Qualifier("forumMessageDao")
	private ForumMessageDao forumMessageDao;


}
