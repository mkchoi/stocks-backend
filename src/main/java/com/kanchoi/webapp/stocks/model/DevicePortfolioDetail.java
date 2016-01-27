package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "device_portfolio_detail", catalog = "sb")
public class DevicePortfolioDetail implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String deviceId;
	private Long portfolioDetailId;
	private Long sequence;
	private String stockSym;
	private String stockName;
	private String marketCode;
	private String action;
	private Double actionPrice;
	private Long actionQty;
	private Date actionTime;
	private Double tradingFee;
	private Long portfolioId;

	public DevicePortfolioDetail() {
	}

	public DevicePortfolioDetail(String deviceId, Long portfolioDetailId) {
		this.deviceId = deviceId;
		this.portfolioDetailId = portfolioDetailId;
	}

	public DevicePortfolioDetail(String deviceId, Long portfolioDetailId, Long sequence, String stockSym, String stockName, 
			String marketCode, String action, Double actionPrice, Long actionQty, Date actionTime, Double tradingFee, 
			Long portfolioId) {
		this.deviceId = deviceId;
		this.portfolioDetailId = portfolioDetailId;
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

	@Id
	@Column(name = "id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "device_id", nullable = false, length = 50)
	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Column(name = "portfolio_detail_id")
	public Long getPortfolioDetailId() {
		return this.portfolioDetailId;
	}

	public void setPortfolioDetailId(Long portfolioDetailId) {
		this.portfolioDetailId = portfolioDetailId;
	}

	@Column(name = "sequence")
	public Long getSequence() {
		return sequence;
	}

	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}

	@Column(name = "stock_sym", unique = false, nullable = true, length = 10)
	public String getStockSym() {
		return this.stockSym;
	}

	public void setStockSym(String stockSym) {
		this.stockSym = stockSym;
	}

	@Column(name = "stock_name", unique = false, nullable = true, length = 50)
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	@Column(name = "market_code", unique = false, nullable = true, length = 2)
	public String getMarketCode() {
		return marketCode;
	}

	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}

	@Column(name = "action", unique = false, nullable = true, length = 5)
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "action_price")
	public Double getActionPrice() {
		return actionPrice;
	}

	public void setActionPrice(Double actionPrice) {
		this.actionPrice = actionPrice;
	}

	@Column(name = "action_qty")
	public Long getActionQty() {
		return actionQty;
	}

	public void setActionQty(Long actionQty) {
		this.actionQty = actionQty;
	}

	@Column(name = "action_time")
	public Date getActionTime() {
		return actionTime;
	}

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	@Column(name = "trading_fee")
	public Double getTradingFee() {
		return tradingFee;
	}

	public void setTradingFee(Double tradingFee) {
		this.tradingFee = tradingFee;
	}

	@Column(name = "portfolio_id")
	public Long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(Long portfolioId) {
		this.portfolioId = portfolioId;
	}
	
	
}
