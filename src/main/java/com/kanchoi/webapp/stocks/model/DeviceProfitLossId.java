package com.kanchoi.webapp.stocks.model;



public class DeviceProfitLossId implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long profitLossId;
	

	public DeviceProfitLossId() {
	}

	public DeviceProfitLossId(String deviceId, long profitLossId) {
		this.deviceId = deviceId;
		this.profitLossId = profitLossId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public long getProfitLossId() {
		return this.profitLossId;
	}

	public void setProfitLossId(long profitLossId) {
		this.profitLossId = profitLossId;
	}

}
