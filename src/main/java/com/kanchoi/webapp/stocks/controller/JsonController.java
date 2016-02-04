/*******************************************************************************
 * Copyright (c) 2013 Tradelink Electronic Commerce Limited.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Tradelink Electronic Commerce Limited - initial API and implementation
 ******************************************************************************/
package com.kanchoi.webapp.stocks.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kanchoi.webapp.stocks.model.DeviceCost;
import com.kanchoi.webapp.stocks.model.DevicePortfolio;
import com.kanchoi.webapp.stocks.model.DevicePortfolioDetail;
import com.kanchoi.webapp.stocks.model.DeviceProfitLoss;
import com.kanchoi.webapp.stocks.model.DeviceSettings;
import com.kanchoi.webapp.stocks.model.DeviceStockExchange;
import com.kanchoi.webapp.stocks.model.DeviceUser;
import com.kanchoi.webapp.stocks.model.DeviceUserPortfolio;
import com.kanchoi.webapp.stocks.model.UserPortfolios;
import com.kanchoi.webapp.stocks.service.AuthorityService;
import com.kanchoi.webapp.stocks.service.DeviceService;
import com.kanchoi.webapp.stocks.service.ForumService;
import com.kanchoi.webapp.stocks.service.UserService;
import com.kanchoi.webapp.stocks.util.CommonUtils;

@Controller
public class JsonController {

	private static Log log = LogFactory.getLog(JsonController.class);

	@Autowired
	private AuthorityService authorityService;
	
	@Autowired
	private DeviceService deviceService;
	
	@Autowired
	private ForumService forumService;
	
	@Autowired
	private UserService userService;
	
	
	@ResponseBody
	@RequestMapping(value = "/json/serviceStatus")
	public Map<String, Object> getServiceStatus() {
		Map<String, Object> models = new HashMap<String, Object>();
		models.put("result", "ok");
		
		return models;
	}
	
	@ResponseBody
	@RequestMapping(value = "/json/getSetting/{key}")
	public Map<String, Object> getSystemSetting(@PathVariable("key") String key, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		models.put("result", "ok");
		
		return models;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/json/getDeviceSettings.do")
	public Map<String, Object> getDeviceSettings(String deviceId, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		DeviceSettings ds = deviceService.getDeviceSettings(deviceId);
		models.put("result", ds);
		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/saveCost.do")
	public Map<String, Object> saveCost(String deviceId, String costId, String tranCost, String tax, String commission, String minChar, String serviceTicket) {
		
		log.info("Getting /json/saveCost.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DeviceCost deviceCost = new DeviceCost();
			deviceCost.setId(Long.parseLong(costId));
			deviceCost.setDeviceId(deviceId);
			deviceCost.setTranCost(Double.parseDouble(tranCost));
			deviceCost.setTax(Double.parseDouble(tax));
			deviceCost.setCommission(Double.parseDouble(commission));
			deviceCost.setMinChar(Double.parseDouble(minChar));
			
			if (deviceService.saveDeviceCost(deviceCost) != null) {
				models.put("result", "ok");
			} else {
				models.put("result", "error");
			}

		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}
	
	@ResponseBody
	@RequestMapping(value = "/json/saveStockExchange.do")
	public Map<String, Object> saveStockExchange(String deviceId, String stockExchangeId, String market, String area, 
			String code, String serviceTicket) {
		
		log.info("Getting /json/saveStockExchange.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DeviceStockExchange deviceStockExchange = new DeviceStockExchange();
			deviceStockExchange.setId(Long.parseLong(stockExchangeId));
			deviceStockExchange.setDeviceId(deviceId);
			deviceStockExchange.setMarket(market);
			deviceStockExchange.setArea(area);
			deviceStockExchange.setCode(code);
			
			if (deviceService.saveDeviceStockExchange(deviceStockExchange) != null) {
				models.put("result", "ok");
			} else {
				models.put("result", "error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/saveUser.do")
	public Map<String, Object> saveUser(String deviceId, String userId, String name, String photo, String type, String share, 
			String addTradingFee, String greenAsRise, String createTime, String serviceTicket) {
		
		log.info("Getting /json/saveUser.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DeviceUser deviceUser = new DeviceUser();
			deviceUser.setId(Long.parseLong(userId));
			deviceUser.setDeviceId(deviceId);
			deviceUser.setName(name);
			deviceUser.setPhoto(photo.getBytes());
			deviceUser.setType(type);
			deviceUser.setShare(share);
			deviceUser.setAddTradingFee(addTradingFee);
			deviceUser.setGreenAsRise(greenAsRise);
			deviceUser.setCreateTime(CommonUtils.stringToDatetime(createTime));
			
			if (deviceService.saveDeviceUser(deviceUser) != null) {
				models.put("result", "ok");
			} else {
				models.put("result", "error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}
	
	
	/*****************************/

	@ResponseBody
	@RequestMapping(value = "/json/getUserPortfolios.do")
	public Map<String, Object> getUserPortfolios(String deviceId, String userId, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		UserPortfolios up = deviceService.getUserPortfolios(deviceId, Long.parseLong(userId));
		models.put("userPortfolios", up);
		return models;
	}
	
	@ResponseBody
	@RequestMapping(value = "/json/saveUserPortfolio.do")
	public Map<String, Object> saveUserPortfolio(String deviceId, String userPortfolioId, String userId, String portfolioId, 
			String createTime, String serviceTicket) {
		
		log.info("Getting /json/saveUserPortfolio.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DeviceUserPortfolio deviceUserPortfolio = new DeviceUserPortfolio();
			deviceUserPortfolio.setId(Long.parseLong(userPortfolioId));
			deviceUserPortfolio.setDeviceId(deviceId);
			deviceUserPortfolio.setUserId(Long.parseLong(userId));
			deviceUserPortfolio.setPortfolioId(Long.parseLong(portfolioId));
			deviceUserPortfolio.setCreateTime(CommonUtils.stringToDatetime(createTime));
			
			if (deviceService.saveDeviceUserPortfolio(deviceUserPortfolio) != null) {
				models.put("result", "ok");
			} else {
				models.put("result", "error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}
	

	@ResponseBody
	@RequestMapping(value = "/json/savePortfolio.do")
	public Map<String, Object> savePortfolio(String deviceId, String portfolioId, String name, String share, String createTime, String serviceTicket) {
		
		log.info("Getting /json/savePortfolio.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DevicePortfolio devicePortfolio = new DevicePortfolio();
			devicePortfolio.setId(Long.parseLong(portfolioId));
			devicePortfolio.setDeviceId(deviceId);
			devicePortfolio.setName(name);
			devicePortfolio.setShare(share);
			devicePortfolio.setCreateTime(CommonUtils.stringToDatetime(createTime));
			
			if (deviceService.saveDevicePortfolio(devicePortfolio) != null) {
				models.put("result", "ok");
			} else {
				models.put("result", "error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/savePortfolioDetail.do")
	public Map<String, Object> savePortfolioDetail(String deviceId, String portfolioDetailId, String sequence, String stockSym, 
			String stockName, String marketCode, String action, String actionPrice, String actionQty, String actionTime, 
			String tradingFee, String portfolioId, String serviceTicket) {
		
		log.info("Getting /json/savePortfolioDetail.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DevicePortfolioDetail devicePortfolioDetail = new DevicePortfolioDetail();
			devicePortfolioDetail.setDeviceId(deviceId);
			devicePortfolioDetail.setPortfolioId(Long.parseLong(portfolioDetailId));
			devicePortfolioDetail.setSequence(Long.parseLong(sequence));
			devicePortfolioDetail.setStockSym(stockSym);
			devicePortfolioDetail.setStockName(stockName);
			devicePortfolioDetail.setMarketCode(marketCode);
			devicePortfolioDetail.setAction(action);
			devicePortfolioDetail.setActionPrice(Double.parseDouble(actionPrice));
			devicePortfolioDetail.setActionQty(Long.parseLong(actionQty));
			devicePortfolioDetail.setActionTime(CommonUtils.stringToDatetime(actionTime));
			devicePortfolioDetail.setTradingFee(Double.parseDouble(tradingFee));
			devicePortfolioDetail.setPortfolioId(Long.parseLong(portfolioId));
			
			if (deviceService.saveDevicePortfolioDetail(devicePortfolioDetail) != null) {
				models.put("result", "ok");
			} else {
				models.put("result", "error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/saveProfitLoss.do")
	public Map<String, Object> saveProfitLoss(String deviceId, String profitLossId, String userId, String portfolioId, 
			String amount, String status, String updateTime, String serviceTicket) {
		
		log.info("Getting /json/saveProfitLoss.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DeviceProfitLoss deviceProfitLoss = new DeviceProfitLoss();
			deviceProfitLoss.setId(Long.parseLong(profitLossId));
			deviceProfitLoss.setDeviceId(deviceId);
			deviceProfitLoss.setUserId(Long.parseLong(userId));
			deviceProfitLoss.setPortfolioId(Long.parseLong(portfolioId));
			deviceProfitLoss.setAmount(Double.parseDouble(amount));
			deviceProfitLoss.setStatus(status);
			deviceProfitLoss.setUpdateTime(CommonUtils.stringToDatetime(updateTime));
			
			if (deviceService.saveDeviceProfitLoss(deviceProfitLoss) != null) {
				models.put("result", "ok");
			} else {
				models.put("result", "error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}
	

	

}
