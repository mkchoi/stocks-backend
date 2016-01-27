package com.kanchoi.webapp.stocks.service;

import com.kanchoi.webapp.stocks.model.DeviceProfitLoss;

public interface DeviceProfitLossService {

	public boolean createProfitLoss(DeviceProfitLoss profitLoss);
	public boolean updateProfitLoss(DeviceProfitLoss profitLoss);
	public boolean deleteProfitLoss(String deviceId, long profitLossId);
	public DeviceProfitLoss getProfitLoss(String deviceId, long profitLossId);
	
	
}
