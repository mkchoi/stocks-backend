package com.kanchoi.webapp.stocks.model;



public class DeviceStockExchangeId implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long stockExchangeId;
	

	public DeviceStockExchangeId() {
	}

	public DeviceStockExchangeId(String deviceId, long stockExchangeId) {
		this.deviceId = deviceId;
		this.stockExchangeId = stockExchangeId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public long getStockExchangeId() {
		return this.stockExchangeId;
	}

	public void setStockExchangeId(long stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

}
