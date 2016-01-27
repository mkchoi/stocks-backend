package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.ForumTopic;

public interface ForumTopicService {

	public boolean createForumTopic(ForumTopic forumTopic);
	public boolean updateForumTopic(ForumTopic forumTopic);
	public boolean deleteForumTopic(long id);
	public ForumTopic getForumTopic(long id);
	
	
}
