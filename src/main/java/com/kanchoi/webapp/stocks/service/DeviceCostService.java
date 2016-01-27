package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.DeviceCost;

public interface DeviceCostService {

	public boolean createCost(DeviceCost cost);
	public boolean updateCost(DeviceCost cost);
	public boolean deleteCost(String deviceId, long costId);
	public DeviceCost getCost(String deviceId, long costId);
	
	
}
