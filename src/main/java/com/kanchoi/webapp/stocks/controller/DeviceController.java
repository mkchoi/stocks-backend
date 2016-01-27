package com.kanchoi.webapp.stocks.controller;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/device")
public class DeviceController {

	private static Log log = LogFactory.getLog(DeviceController.class);

	public DeviceController() {}

	@RequestMapping(value = "/notice")
	public String showNoticePage(Map<String, Object> model) {
		return "device/notice";
	}
	
	@RequestMapping(value = "/ranking")
	public String showRankingPage(Map<String, Object> model) {
		return "device/ranking";
	}

}
