package com.kanchoi.webapp.stocks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "device_stock_exchange")
public class DeviceStockExchange implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "device_id", nullable = false, length = 50)
	private String deviceId;
	
	@Column(name = "stock_exchange_id")
	private Long stockExchangeId;
	
	@Column(name = "market", unique = false, nullable = true, length = 20)
	private String market;
	
	@Column(name = "area", unique = false, nullable = true, length = 20)
	private String area;
	
	@Column(name = "code", unique = false, nullable = true, length = 2)
	private String code;

	public DeviceStockExchange() {
	}

	public DeviceStockExchange(String deviceId, Long stockExchangeId) {
		this.deviceId = deviceId;
		this.setStockExchangeId(stockExchangeId);
	}

	public DeviceStockExchange(String deviceId, Long stockExchangeId, String market, String area, String code) {
		this.deviceId = deviceId;
		this.stockExchangeId = stockExchangeId;
		this.market = market;
		this.area = area;
		this.code = code;
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

	public Long getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(Long stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public String getMarket() {
		return this.market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
}
