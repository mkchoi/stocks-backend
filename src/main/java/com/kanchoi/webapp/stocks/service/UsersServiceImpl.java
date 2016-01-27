package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.UsersDao;
import com.kanchoi.webapp.stocks.model.Users;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
	private static Log log = LogFactory.getLog(UsersServiceImpl.class);

	@Autowired
	@Qualifier("usersDao")
	private UsersDao usersDao;

	
}
