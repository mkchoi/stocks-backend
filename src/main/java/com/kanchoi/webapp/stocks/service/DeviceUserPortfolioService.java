package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.DeviceUserPortfolio;

public interface DeviceUserPortfolioService {

	public boolean createUserPortfolio(DeviceUserPortfolio userPortfolio);
	public boolean updateUserPortfolio(DeviceUserPortfolio userPortfolio);
	public boolean deleteUserPortfolio(String deviceId, long userPortfolioId);
	public DeviceUserPortfolio getUserPortfolio(String deviceId, long userPortfolioId);
	
	
}
