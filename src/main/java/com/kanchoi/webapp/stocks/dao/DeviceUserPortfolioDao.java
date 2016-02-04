package com.kanchoi.webapp.stocks.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DeviceUserPortfolio;

public interface DeviceUserPortfolioDao extends JpaRepository<DeviceUserPortfolio, Long> {
	public List<DeviceUserPortfolio> findByDeviceIdAndUserId(String deviceId, Long userId);
}
