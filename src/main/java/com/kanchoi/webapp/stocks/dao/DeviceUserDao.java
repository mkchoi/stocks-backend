package com.kanchoi.webapp.stocks.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DeviceUser;

public interface DeviceUserDao extends JpaRepository<DeviceUser, Long> {
	public List<DeviceUser> findByDeviceId(String deviceId);
}
