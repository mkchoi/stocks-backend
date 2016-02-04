package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "device_portfolio_detail")
public class DevicePortfolioDetail implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "device_id", nullable = false, length = 50)
	private String deviceId;
	
	@Column(name = "sequence")
	private Long sequence;
	
	@Column(name = "stock_sym", unique = false, nullable = true, length = 10)
	private String stockSym;
	
	@Column(name = "stock_name", unique = false, nullable = true, length = 50)
	private String stockName;
	
	@Column(name = "market_code", unique = false, nullable = true, length = 2)
	private String marketCode;
	
	@Column(name = "action", unique = false, nullable = true, length = 5)
	private String action;
	
	@Column(name = "action_price")
	private Double actionPrice;
	
	@Column(name = "action_qty")
	private Long actionQty;
	
	@Column(name = "action_time")
	private Date actionTime;
	
	@Column(name = "trading_fee")
	private Double tradingFee;
	
	@Column(name = "portfolio_id")
	private Long portfolioId;

	public DevicePortfolioDetail() {
	}

	public DevicePortfolioDetail(String deviceId, Long sequence, String stockSym, String stockName, 
			String marketCode, String action, Double actionPrice, Long actionQty, Date actionTime, Double tradingFee, 
			Long portfolioId) {
		this.deviceId = deviceId;
		this.sequence = sequence;
		this.stockSym = stockSym;
		this.stockName = stockName;
		this.marketCode = marketCode;
		this.action = action;
		this.actionPrice = actionPrice;
		this.actionQty = actionQty;
		this.actionTime = actionTime;
		this.tradingFee = tradingFee;
		this.portfolioId = portfolioId;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Long getSequence() {
		return sequence;
	}

	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}

	public String getStockSym() {
		return this.stockSym;
	}

	public void setStockSym(String stockSym) {
		this.stockSym = stockSym;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	public String getMarketCode() {
		return marketCode;
	}

	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Double getActionPrice() {
		return actionPrice;
	}

	public void setActionPrice(Double actionPrice) {
		this.actionPrice = actionPrice;
	}

	public Long getActionQty() {
		return actionQty;
	}

	public void setActionQty(Long actionQty) {
		this.actionQty = actionQty;
	}

	public Date getActionTime() {
		return actionTime;
	}

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}
	
	public Double getTradingFee() {
		return tradingFee;
	}

	public void setTradingFee(Double tradingFee) {
		this.tradingFee = tradingFee;
	}
	
	public Long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(Long portfolioId) {
		this.portfolioId = portfolioId;
	}
	
	
}
