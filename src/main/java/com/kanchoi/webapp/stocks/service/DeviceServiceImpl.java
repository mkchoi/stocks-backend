package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kanchoi.webapp.stocks.dao.DeviceUserDao;

@Service("deviceService")
@Transactional(value = "transactionManager", rollbackFor = Throwable.class)
public class DeviceServiceImpl implements DeviceService {
	private static Log log = LogFactory.getLog(DeviceServiceImpl.class);

	@Autowired
	@Qualifier("deviceUserDao")
	private DeviceUserDao deviceUserDao;

	
}
