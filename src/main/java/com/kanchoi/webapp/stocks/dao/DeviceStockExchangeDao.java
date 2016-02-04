package com.kanchoi.webapp.stocks.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DeviceStockExchange;

public interface DeviceStockExchangeDao extends JpaRepository<DeviceStockExchange, Long> {
	public List<DeviceStockExchange> findByDeviceId(String deviceId);
}
