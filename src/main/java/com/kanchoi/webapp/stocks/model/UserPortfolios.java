package com.kanchoi.webapp.stocks.model;

import java.util.ArrayList;
import java.util.List;

public class UserPortfolios {

	private String deviceId;
	private Long userId;
	private List<DevicePortfolio> portfolioList;
	
	public UserPortfolios() {
		portfolioList = new ArrayList<DevicePortfolio>();
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<DevicePortfolio> getPortfolioList() {
		return portfolioList;
	}

	public void setPortfolioList(List<DevicePortfolio> portfolioList) {
		this.portfolioList = portfolioList;
	}
	
}
