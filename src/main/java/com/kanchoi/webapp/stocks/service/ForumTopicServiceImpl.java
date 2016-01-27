package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.ForumTopicDao;
import com.kanchoi.webapp.stocks.model.ForumTopic;

@Service("forumTopicService")
public class ForumTopicServiceImpl implements ForumTopicService {
	private static Log log = LogFactory.getLog(ForumTopicServiceImpl.class);

	@Autowired
	@Qualifier("forumTopicDao")
	private ForumTopicDao forumTopicDao;


	public boolean createForumTopic(ForumTopic forumTopic) {
		return forumTopicDao.create(forumTopic);
	}
	
	
	public boolean updateForumTopic(ForumTopic forumTopic) {
		return forumTopicDao.update(forumTopic);
	}
	
	
	public boolean deleteForumTopic(long id) {
		return forumTopicDao.delete(id);	
	}
	
	
	public ForumTopic getForumTopic(long id) {
		return forumTopicDao.get(id);
	}
	
}
