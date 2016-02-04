package com.kanchoi.webapp.stocks.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DeviceCost;

public interface DeviceCostDao extends JpaRepository<DeviceCost, Long> {
	public List<DeviceCost> findByDeviceId(String deviceId);
}
