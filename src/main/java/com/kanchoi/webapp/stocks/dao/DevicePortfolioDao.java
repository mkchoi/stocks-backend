package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DevicePortfolio;

public interface DevicePortfolioDao extends JpaRepository<DevicePortfolio, Long> {
	public DevicePortfolio findByDeviceIdAndPortfolioId(String deviceId, Long portfolioId);
	
}
