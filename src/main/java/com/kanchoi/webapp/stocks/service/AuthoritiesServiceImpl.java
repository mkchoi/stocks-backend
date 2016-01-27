package com.kanchoi.webapp.stocks.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.AuthoritiesDao;
import com.kanchoi.webapp.stocks.model.Authorities;

@Service("authoritiesService")
public class AuthoritiesServiceImpl implements AuthoritiesService {
	private static Log log = LogFactory.getLog(AuthoritiesServiceImpl.class);

	@Autowired
	@Qualifier("authoritiesDao")
	private AuthoritiesDao authoritiesDao;


	public boolean createAuthority(Authorities authority) {
		return authoritiesDao.create(authority);
	}
	
	
	public boolean updateAuthority(Authorities authority) {
		return authoritiesDao.update(authority);
	}
	
	
	public boolean deleteAuthority(String username) {
		return authoritiesDao.delete(username);	
	}
	
	
	public List<Authorities> getAuthorities(String username) {
		return authoritiesDao.get(username);
	}
	
}
