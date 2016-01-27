package com.kanchoi.webapp.stocks.model;


public class DevicePortfolioDetailId implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long portfolioDetailId;
	

	public DevicePortfolioDetailId() {
	}

	public DevicePortfolioDetailId(String deviceId, long portfolioDetailId) {
		this.deviceId = deviceId;
		this.portfolioDetailId = portfolioDetailId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public long getPortfolioDetailId() {
		return this.portfolioDetailId;
	}

	public void setPortfolioDetailId(long portfolioDetailId) {
		this.portfolioDetailId = portfolioDetailId;
	}

}
