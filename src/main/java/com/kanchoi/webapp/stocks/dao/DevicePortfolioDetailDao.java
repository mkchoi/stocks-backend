package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DevicePortfolioDetail;

public interface DevicePortfolioDetailDao extends JpaRepository<DevicePortfolioDetail, Long> {
	public DevicePortfolioDetail findByDeviceIdAndPortfolioDetailId(String deviceId, Long portfolioDetailId);
	
}
