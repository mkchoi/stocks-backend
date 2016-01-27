package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DeviceUserPortfolio;

public interface DeviceUserPortfolioDao extends JpaRepository<DeviceUserPortfolio, Long> {
	public DeviceUserPortfolio findByDeviceIdAndUserPortfolioId(String deviceId, Long userPortfolioId);
	
}
