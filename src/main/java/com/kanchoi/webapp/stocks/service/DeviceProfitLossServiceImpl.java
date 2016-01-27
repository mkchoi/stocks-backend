package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.DeviceProfitLossDao;
import com.kanchoi.webapp.stocks.model.DeviceProfitLoss;

@Service("deviceProfitLossService")
public class DeviceProfitLossServiceImpl implements DeviceProfitLossService {
	private static Log log = LogFactory.getLog(DeviceProfitLossServiceImpl.class);

	@Autowired
	@Qualifier("deviceProfitLossDao")
	private DeviceProfitLossDao deviceProfitLossDao;



}
