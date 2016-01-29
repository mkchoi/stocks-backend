package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kanchoi.webapp.stocks.dao.AuthoritiesDao;

@Service("authorityService")
@Transactional(value = "transactionManager", rollbackFor = Throwable.class)
public class AuthorityServiceImpl implements AuthorityService {
	private static Log log = LogFactory.getLog(AuthorityServiceImpl.class);

	@Autowired
	@Qualifier("authoritiesDao")
	private AuthoritiesDao authoritiesDao;

	
}
