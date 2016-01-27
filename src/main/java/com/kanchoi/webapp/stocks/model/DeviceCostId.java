package com.kanchoi.webapp.stocks.model;



public class DeviceCostId implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long costId;
	

	public DeviceCostId() {
	}

	public DeviceCostId(String deviceId, long costId) {
		this.deviceId = deviceId;
		this.costId = costId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public long getCostId() {
		return this.costId;
	}

	public void setCostId(long costId) {
		this.costId = costId;
	}

}
