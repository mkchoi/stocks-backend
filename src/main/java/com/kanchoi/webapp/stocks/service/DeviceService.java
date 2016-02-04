package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.DeviceCost;
import com.kanchoi.webapp.stocks.model.DevicePortfolio;
import com.kanchoi.webapp.stocks.model.DevicePortfolioDetail;
import com.kanchoi.webapp.stocks.model.DeviceProfitLoss;
import com.kanchoi.webapp.stocks.model.DeviceSettings;
import com.kanchoi.webapp.stocks.model.DeviceStockExchange;
import com.kanchoi.webapp.stocks.model.DeviceUser;
import com.kanchoi.webapp.stocks.model.DeviceUserPortfolio;
import com.kanchoi.webapp.stocks.model.UserPortfolios;

public interface DeviceService {

	public DeviceSettings getDeviceSettings(String deviceId);
	public DeviceCost saveDeviceCost(DeviceCost deviceCost);
	public DeviceStockExchange saveDeviceStockExchange(DeviceStockExchange deviceStockExchange);
	public DeviceUser saveDeviceUser(DeviceUser deviceUser);
	public UserPortfolios getUserPortfolios(String deviceId, Long userId);
	public DeviceUserPortfolio saveDeviceUserPortfolio(DeviceUserPortfolio deviceUserPortfolio);
	public DevicePortfolio saveDevicePortfolio(DevicePortfolio devicePortfolio);
	public DevicePortfolioDetail saveDevicePortfolioDetail(DevicePortfolioDetail devicePortfolioDetail);
	public DeviceProfitLoss saveDeviceProfitLoss(DeviceProfitLoss deviceProfitLoss);
	
}
