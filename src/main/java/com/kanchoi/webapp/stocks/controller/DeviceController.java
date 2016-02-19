package com.kanchoi.webapp.stocks.controller;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/device")
public class DeviceController {

	private static Log log = LogFactory.getLog(DeviceController.class);

	public DeviceController() {}

	@RequestMapping(value = "/notice")
	public String showNoticePage(Map<String, Object> model,
			@RequestParam(value="lang", required = false) String lang) {
		return "device/notice";
	}
	
	@RequestMapping(value = "/explore")
	public String showStatisticsPage(Map<String, Object> model,
			@RequestParam(value="lang", required = false) String lang) {
		return "device/explore";
	}
	
	@RequestMapping(value = "/ranking")
	public String showRankingPage(Map<String, Object> model,
			@RequestParam(value="lang", required = false) String lang) {
		return "device/ranking";
	}

}
