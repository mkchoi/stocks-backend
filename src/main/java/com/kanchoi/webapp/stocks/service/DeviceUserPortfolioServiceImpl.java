package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.DeviceUserPortfolioDao;
import com.kanchoi.webapp.stocks.model.DeviceUserPortfolio;

@Service("deviceUserPortfolioService")
public class DeviceUserPortfolioServiceImpl implements DeviceUserPortfolioService {
	private static Log log = LogFactory.getLog(DeviceUserPortfolioServiceImpl.class);

	@Autowired
	@Qualifier("deviceUserPortfolioDao")
	private DeviceUserPortfolioDao deviceUserPortfolioDao;


	public boolean createUserPortfolio(DeviceUserPortfolio userPortfolio) {
		return deviceUserPortfolioDao.create(userPortfolio);
	}
	
	
	public boolean updateUserPortfolio(DeviceUserPortfolio userPortfolio) {
		return deviceUserPortfolioDao.update(userPortfolio);
	}
	
	
	public boolean deleteUserPortfolio(String deviceId, long userPortfolioId) {
		return deviceUserPortfolioDao.delete(deviceId, userPortfolioId);	
	}
	
	
	public DeviceUserPortfolio getUserPortfolio(String deviceId, long userPortfolioId) {
		return deviceUserPortfolioDao.get(deviceId, userPortfolioId);
	}
	
}
