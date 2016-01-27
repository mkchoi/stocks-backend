package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.ForumMessage;

public interface ForumMessageService {

	public boolean createForumMessage(ForumMessage forumMessage);
	public boolean updateForumMessage(ForumMessage forumMessage);
	public boolean deleteForumMessage(long id);
	public ForumMessage getForumMessage(long id);
	
	
}
