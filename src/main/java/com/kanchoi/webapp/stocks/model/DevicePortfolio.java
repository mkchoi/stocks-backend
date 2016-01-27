package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "device_portfolio", catalog = "sb")
@IdClass(DevicePortfolioId.class)
public class DevicePortfolio implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long portfolioId;
	private String name;
	private String share;
	private Date createTime;

	public DevicePortfolio() {
	}

	public DevicePortfolio(String deviceId, long portfolioId) {
		this.deviceId = deviceId;
		this.portfolioId = portfolioId;
	}

	public DevicePortfolio(String deviceId, long portfolioId, String name, String share, Date createTime) {
		this.deviceId = deviceId;
		this.portfolioId = portfolioId;
		this.name = name;
		this.share = share;
		this.createTime = createTime;
		
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
	@Column(name = "portfolio_id")
	public long getPortfolioId() {
		return this.portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	@Column(name = "name", unique = false, nullable = true, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "share", unique = false, nullable = true, length = 3)
	public String getShare() {
		return this.share;
	}

	public void setShare(String share) {
		this.share = share;
	}
	
	@Column(name = "create_time")
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
