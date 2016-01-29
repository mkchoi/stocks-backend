package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kanchoi.webapp.stocks.dao.UsersDao;

@Service("userService")
@Transactional(value = "transactionManager", rollbackFor = Throwable.class)
public class UserServiceImpl implements UserService {
	private static Log log = LogFactory.getLog(UserServiceImpl.class);

	@Autowired
	@Qualifier("usersDao")
	private UsersDao usersDao;

	
}
