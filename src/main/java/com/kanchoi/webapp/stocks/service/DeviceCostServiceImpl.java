package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.DeviceCostDao;
import com.kanchoi.webapp.stocks.model.DeviceCost;

@Service("deviceCostService")
public class DeviceCostServiceImpl implements DeviceCostService {
	private static Log log = LogFactory.getLog(DeviceCostServiceImpl.class);

	@Autowired
	@Qualifier("deviceCostDao")
	private DeviceCostDao deviceCostDao;

	
}
