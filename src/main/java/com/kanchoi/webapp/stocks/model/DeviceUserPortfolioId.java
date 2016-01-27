package com.kanchoi.webapp.stocks.model;



public class DeviceUserPortfolioId implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long userPortfolioId;
	

	public DeviceUserPortfolioId() {
	}

	public DeviceUserPortfolioId(String deviceId, long userPortfolioId) {
		this.deviceId = deviceId;
		this.userPortfolioId = userPortfolioId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public long getUserPortfolioId() {
		return this.userPortfolioId;
	}

	public void setUserPortfolioId(long userPortfolioId) {
		this.userPortfolioId = userPortfolioId;
	}

}
