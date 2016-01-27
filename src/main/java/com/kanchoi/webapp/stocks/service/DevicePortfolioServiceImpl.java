package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.DevicePortfolioDao;
import com.kanchoi.webapp.stocks.model.DevicePortfolio;

@Service("devicePortfolioService")
public class DevicePortfolioServiceImpl implements DevicePortfolioService {
	private static Log log = LogFactory.getLog(DevicePortfolioServiceImpl.class);

	@Autowired
	@Qualifier("devicePortfolioDao")
	private DevicePortfolioDao devicePortfolioDao;



}
