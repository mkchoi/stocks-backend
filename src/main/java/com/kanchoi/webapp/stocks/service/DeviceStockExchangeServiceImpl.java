package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.DeviceStockExchangeDao;
import com.kanchoi.webapp.stocks.model.DeviceStockExchange;

@Service("deviceStockExchangeService")
public class DeviceStockExchangeServiceImpl implements DeviceStockExchangeService {
	private static Log log = LogFactory.getLog(DeviceStockExchangeServiceImpl.class);

	@Autowired
	@Qualifier("deviceStockExchangeDao")
	private DeviceStockExchangeDao deviceStockExchangeDao;


	
}
