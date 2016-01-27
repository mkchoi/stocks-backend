package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.DevicePortfolioDetail;

public interface DevicePortfolioDetailService {

	public boolean createPortfolioDetail(DevicePortfolioDetail portfolioDetail);
	public boolean updatePortfolioDetail(DevicePortfolioDetail portfolioDetail);
	public boolean deletePortfolioDetail(String deviceId, long portfolioDetailId);
	public DevicePortfolioDetail getPortfolioDetail(String deviceId, long portfolioDetailId);
	
	
}
