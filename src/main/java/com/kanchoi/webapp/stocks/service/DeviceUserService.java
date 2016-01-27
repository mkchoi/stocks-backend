package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.DeviceUser;

public interface DeviceUserService {

	public boolean createUser(DeviceUser user);
	public boolean updateUser(DeviceUser user);
	public boolean deleteUser(String deviceId, long userId);
	public DeviceUser getUser(String deviceId, long userId);
	
	
}
