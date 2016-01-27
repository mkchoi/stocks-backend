package com.kanchoi.webapp.stocks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "device_stock_exchange", catalog = "sb")
@IdClass(DeviceStockExchangeId.class)
public class DeviceStockExchange implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long stockExchangeId;
	private String market;
	private String area;
	private String code;

	public DeviceStockExchange() {
	}

	public DeviceStockExchange(String deviceId, long stockExchangeId) {
		this.deviceId = deviceId;
		this.setStockExchangeId(stockExchangeId);
	}

	public DeviceStockExchange(String deviceId, long stockExchangeId, String market, String area, String code) {
		this.deviceId = deviceId;
		this.stockExchangeId = stockExchangeId;
		this.market = market;
		this.area = area;
		this.code = code;
	}

	@Id
	@Column(name = "device_id", nullable = false, length = 50)
	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Id
	@Column(name = "stock_exchange_id")
	public long getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(long stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	@Column(name = "market", unique = false, nullable = true, length = 20)
	public String getMarket() {
		return this.market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	@Column(name = "area", unique = false, nullable = true, length = 20)
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "code", unique = false, nullable = true, length = 2)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
}
