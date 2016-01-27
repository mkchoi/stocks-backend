package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.Users;

public interface UsersService {

	public boolean createUser(Users user);
	public boolean updateUser(Users user);
	public boolean deleteUser(String username);
	public Users getUser(String username);
	
	
}
