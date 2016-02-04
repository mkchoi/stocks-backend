package com.kanchoi.webapp.stocks.model;

public class DeviceSettings {

	private DeviceCost deviceCost;
	private DeviceStockExchange deviceStockExchange;
	private DeviceUser deviceUser;
	
	public DeviceSettings() {}

	public DeviceCost getDeviceCost() {
		return deviceCost;
	}

	public void setDeviceCost(DeviceCost deviceCost) {
		this.deviceCost = deviceCost;
	}

	public DeviceStockExchange getDeviceStockExchange() {
		return deviceStockExchange;
	}

	public void setDeviceStockExchange(DeviceStockExchange deviceStockExchange) {
		this.deviceStockExchange = deviceStockExchange;
	}

	public DeviceUser getDeviceUser() {
		return deviceUser;
	}

	public void setDeviceUser(DeviceUser deviceUser) {
		this.deviceUser = deviceUser;
	}
	
	
}
