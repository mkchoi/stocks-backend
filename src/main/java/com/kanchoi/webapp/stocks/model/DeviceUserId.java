package com.kanchoi.webapp.stocks.model;



public class DeviceUserId implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long userId;
	

	public DeviceUserId() {
	}

	public DeviceUserId(String deviceId, long userId) {
		this.deviceId = deviceId;
		this.userId = userId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
