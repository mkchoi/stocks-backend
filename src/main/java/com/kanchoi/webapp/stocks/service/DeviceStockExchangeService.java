package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.DeviceStockExchange;

public interface DeviceStockExchangeService {

	public boolean createStockExchange(DeviceStockExchange stockExchange);
	public boolean updateStockExchange(DeviceStockExchange stockExchange);
	public boolean deleteStockExchange(String deviceId, long stockExchangeId);
	public DeviceStockExchange getStockExchange(String deviceId, long stockExchangeId);
	
	
}
