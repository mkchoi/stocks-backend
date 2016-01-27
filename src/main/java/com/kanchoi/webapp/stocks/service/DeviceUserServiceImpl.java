package com.kanchoi.webapp.stocks.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kanchoi.webapp.stocks.dao.DeviceUserDao;
import com.kanchoi.webapp.stocks.model.DeviceUser;

@Service("deviceUserService")
public class DeviceUserServiceImpl implements DeviceUserService {
	private static Log log = LogFactory.getLog(DeviceUserServiceImpl.class);

	@Autowired
	@Qualifier("deviceUserDao")
	private DeviceUserDao deviceUserDao;

	
}
