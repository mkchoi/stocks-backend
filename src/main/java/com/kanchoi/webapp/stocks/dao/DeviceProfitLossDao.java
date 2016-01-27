package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DeviceProfitLoss;

public interface DeviceProfitLossDao extends JpaRepository<DeviceProfitLoss, Long> {
	public DeviceProfitLoss findByDeviceIdAndProfitLossId(String deviceId, Long profitLossId);

	
}
