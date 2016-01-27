package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.DevicePortfolioDetailDao;
import com.kanchoi.webapp.stocks.model.DevicePortfolioDetail;

@Service("devicePortfolioDetailService")
public class DevicePortfolioDetailServiceImpl implements DevicePortfolioDetailService {
	private static Log log = LogFactory.getLog(DevicePortfolioDetailServiceImpl.class);

	@Autowired
	@Qualifier("devicePortfolioDetailDao")
	private DevicePortfolioDetailDao devicePortfolioDetailDao;


	public boolean createPortfolioDetail(DevicePortfolioDetail portfolioDetail) {
		return devicePortfolioDetailDao.create(portfolioDetail);
	}
	
	
	public boolean updatePortfolioDetail(DevicePortfolioDetail portfolioDetail) {
		return devicePortfolioDetailDao.update(portfolioDetail);
	}
	
	
	public boolean deletePortfolioDetail(String deviceId, long portfolioDetailId) {
		return devicePortfolioDetailDao.delete(deviceId, portfolioDetailId);	
	}
	
	
	public DevicePortfolioDetail getPortfolioDetail(String deviceId, long portfolioDetailId) {
		return devicePortfolioDetailDao.get(deviceId, portfolioDetailId);
	}
	
}