package com.kanchoi.webapp.stocks.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DeviceProfitLoss;

public interface DeviceProfitLossDao extends JpaRepository<DeviceProfitLoss, Long> {
	List<DeviceProfitLoss> findByDeviceIdAndUserIdAndPortfolioId(String deviceId, Long userId, Long portfolioId);
	
}
