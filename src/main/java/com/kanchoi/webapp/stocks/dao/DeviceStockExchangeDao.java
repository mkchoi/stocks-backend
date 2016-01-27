package com.kanchoi.webapp.stocks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DeviceStockExchange;

public interface DeviceStockExchangeDao extends JpaRepository<DeviceStockExchange, Long> {
	public DeviceStockExchange findByDeviceIdAndStockExchangeId(String deviceId, Long stockExchangeId);
	
}
