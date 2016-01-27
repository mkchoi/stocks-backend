package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.DevicePortfolio;

public interface DevicePortfolioService {

	public boolean createPortfolio(DevicePortfolio portfolio);
	public boolean updatePortfolio(DevicePortfolio portfolio);
	public boolean deletePortfolio(String deviceId, long portfolioId);
	public DevicePortfolio getPortfolio(String deviceId, long portfolioId);
	
	
}
