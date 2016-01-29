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
import com.kanchoi.webapp.stocks.model.DeviceStockExchange;
import com.kanchoi.webapp.stocks.model.DeviceUser;
import com.kanchoi.webapp.stocks.model.DeviceUserPortfolio;
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
	public Map getServiceStatus() {
		Map<String, Object> models = new HashMap<String, Object>();
		models.put("result", "ok");
		
		return models;
	}
	
	@ResponseBody
	@RequestMapping(value = "/json/getSetting/{key}")
	public Map getSystemSetting(@PathVariable("key") String key, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		models.put("result", "ok");
		
		return models;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/json/getCost.do")
	public Map getCost(String deviceId, String costId, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/saveCost.do")
	public Map saveCost(String deviceId, String costId, String tranCost, String tax, String commission, String minChar, String serviceTicket) {
		
		log.info("Getting /json/saveCost.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DeviceCost deviceCost = new DeviceCost();
			deviceCost.setDeviceId(deviceId);
			deviceCost.setCostId(Long.parseLong(costId));
			deviceCost.setTranCost(Double.parseDouble(tranCost));
			deviceCost.setTax(Double.parseDouble(tax));
			deviceCost.setCommission(Double.parseDouble(commission));
			deviceCost.setMinChar(Double.parseDouble(minChar));

		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/getPortfolio.do")
	public Map getPortfolio(String deviceId, String portfolioId, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		
		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/savePortfolio.do")
	public Map savePortfolio(String deviceId, String portfolioId, String name, String share, String createTime, String serviceTicket) {
		
		log.info("Getting /json/savePortfolio.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DevicePortfolio devicePortfolio = new DevicePortfolio();
			devicePortfolio.setDeviceId(deviceId);
			devicePortfolio.setPortfolioId(Long.parseLong(portfolioId));
			devicePortfolio.setName(name);
			devicePortfolio.setShare(share);
			devicePortfolio.setCreateTime(CommonUtils.stringToDatetime(createTime));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}
	
	@ResponseBody
	@RequestMapping(value = "/json/getPortfolioDetail.do")
	public Map getPortfolioDetail(String deviceId, String portfolioDetailId, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		
		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/savePortfolioDetail.do")
	public Map savePortfolioDetail(String deviceId, String portfolioDetailId, String sequence, String stockSym, 
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
			
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}
	
	@ResponseBody
	@RequestMapping(value = "/json/getProfitLoss.do")
	public Map getProfitLoss(String deviceId, String profitLossId, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		
		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/saveProfitLoss.do")
	public Map saveProfitLoss(String deviceId, String profitLossId, String userId, String portfolioId, 
			String amount, String status, String updateTime, String serviceTicket) {
		
		log.info("Getting /json/saveProfitLoss.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DeviceProfitLoss deviceProfitLoss = new DeviceProfitLoss();
			deviceProfitLoss.setDeviceId(deviceId);
			deviceProfitLoss.setProfitLossId(Long.parseLong(profitLossId));
			deviceProfitLoss.setUserId(Long.parseLong(userId));
			deviceProfitLoss.setPortfolioId(Long.parseLong(portfolioId));
			deviceProfitLoss.setAmount(Double.parseDouble(amount));
			deviceProfitLoss.setStatus(status);
			deviceProfitLoss.setUpdateTime(CommonUtils.stringToDatetime(updateTime));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}
	
	@ResponseBody
	@RequestMapping(value = "/json/getStockExchange.do")
	public Map getStockExchange(String deviceId, String stockExchangeId, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		
		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/saveStockExchange.do")
	public Map saveStockExchange(String deviceId, String stockExchangeId, String market, String area, 
			String code, String serviceTicket) {
		
		log.info("Getting /json/saveStockExchange.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DeviceStockExchange deviceStockExchange = new DeviceStockExchange();
			deviceStockExchange.setDeviceId(deviceId);
			deviceStockExchange.setStockExchangeId(Long.parseLong(stockExchangeId));
			deviceStockExchange.setMarket(market);
			deviceStockExchange.setArea(area);
			deviceStockExchange.setCode(code);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}
	
	@ResponseBody
	@RequestMapping(value = "/json/getUser.do")
	public Map getUser(String deviceId, String userId, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		
		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/saveUser.do")
	public Map saveUser(String deviceId, String userId, String name, String photo, String type, String share, 
			String addTradingFee, String greenAsRise, String createTime, String serviceTicket) {
		
		log.info("Getting /json/saveUser.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DeviceUser deviceUser = new DeviceUser();
			deviceUser.setDeviceId(deviceId);
			deviceUser.setUserId(Long.parseLong(userId));
			deviceUser.setName(name);
			deviceUser.setPhoto(photo.getBytes());
			deviceUser.setType(type);
			deviceUser.setShare(share);
			deviceUser.setAddTradingFee(addTradingFee);
			deviceUser.setGreenAsRise(greenAsRise);
			deviceUser.setCreateTime(CommonUtils.stringToDatetime(createTime));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}
	
	@ResponseBody
	@RequestMapping(value = "/json/getUserPortfolio.do")
	public Map getUserPortfolio(String deviceId, String userPortfolioId, String serviceTicket) {
		
		Map<String, Object> models = new HashMap<String, Object>();
		
		return models;
	}

	@ResponseBody
	@RequestMapping(value = "/json/saveUserPortfolio.do")
	public Map saveUserPortfolio(String deviceId, String userPortfolioId, String userId, String portfolioId, 
			String createTime, String serviceTicket) {
		
		log.info("Getting /json/saveUserPortfolio.do...");
		Map<String, Object> models = new HashMap<String, Object>();
		
		try {
			DeviceUserPortfolio deviceUserPortfolio = new DeviceUserPortfolio();
			deviceUserPortfolio.setDeviceId(deviceId);
			deviceUserPortfolio.setUserPortfolioId(Long.parseLong(userPortfolioId));
			deviceUserPortfolio.setUserId(Long.parseLong(userId));
			deviceUserPortfolio.setPortfolioId(Long.parseLong(portfolioId));
			deviceUserPortfolio.setCreateTime(CommonUtils.stringToDatetime(createTime));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			models.put("result", "error");
		}

		return models;
	}
	

}
