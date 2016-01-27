package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DeviceCost;

public interface DeviceCostDao extends JpaRepository<DeviceCost, Long> {
	public DeviceCost findByDeviceIdAndCostId(String deviceId, Long costId);
}
