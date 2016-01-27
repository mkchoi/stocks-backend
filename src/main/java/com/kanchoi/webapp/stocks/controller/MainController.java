package com.kanchoi.webapp.stocks.controller;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

	private static Log log = LogFactory.getLog(MainController.class);

	public MainController() {}

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String showMainPage(Map<String, Object> model) {
		return "index";
	}

	@RequestMapping(value = "/logout")
	public String showLogoutPage(Map<String, Object> model) {
		return "casLogout";
	}

	@RequestMapping(value = "/loginFailed")
	public String showFailPage(Map<String, Object> model) {
		return "error/casFailed";
	}

	@RequestMapping(value = "/accessDenied")
	public String showAccessDeniedPage() {
		return "error/accessDenied";
	}

	@RequestMapping(value = "/timeout")
	public String showTimeoutPage() {
		return "error/timeout";
	}

	@RequestMapping(value = "/errorCode405")
	public String handle405InternalServerError() {
		return "error/405";
	}

	@RequestMapping(value = "/errorCode500")
	public String handle500InternalServerError() {
		return "error/500";
	}
	
}
