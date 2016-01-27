package com.kanchoi.webapp.stocks.model;



public class DevicePortfolioId implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long portfolioId;
	

	public DevicePortfolioId() {
	}

	public DevicePortfolioId(String deviceId, long portfolioId) {
		this.deviceId = deviceId;
		this.portfolioId = portfolioId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public long getPortfolioId() {
		return this.portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

}
