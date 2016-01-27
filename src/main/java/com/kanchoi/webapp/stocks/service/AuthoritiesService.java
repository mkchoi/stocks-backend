package com.kanchoi.webapp.stocks.service;

import java.util.List;

import com.kanchoi.webapp.stocks.model.Authorities;

public interface AuthoritiesService {

	public boolean createAuthority(Authorities authority);
	public boolean updateAuthority(Authorities authority);
	public boolean deleteAuthority(String username);
	public List<Authorities> getAuthorities(String username);
	
	
}
