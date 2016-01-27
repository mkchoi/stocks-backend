package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.ForumMessageDao;
import com.kanchoi.webapp.stocks.model.ForumMessage;

@Service("forumMessageService")
public class ForumMessageServiceImpl implements ForumMessageService {
	private static Log log = LogFactory.getLog(ForumMessageServiceImpl.class);

	@Autowired
	@Qualifier("forumMessageDao")
	private ForumMessageDao forumMessageDao;


	public boolean createForumMessage(ForumMessage forumMessage) {
		return forumMessageDao.create(forumMessage);
	}
	
	
	public boolean updateForumMessage(ForumMessage forumMessage) {
		return forumMessageDao.update(forumMessage);
	}
	
	
	public boolean deleteForumMessage(long id) {
		return forumMessageDao.delete(id);	
	}
	
	
	public ForumMessage getForumMessage(long id) {
		return forumMessageDao.get(id);
	}
	
}
