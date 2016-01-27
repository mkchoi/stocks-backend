package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DeviceUser;

public interface DeviceUserDao extends JpaRepository<DeviceUser, Long> {
	public DeviceUser findByDeviceIdAndUserId(String deviceId, Long userId);	
	
}
