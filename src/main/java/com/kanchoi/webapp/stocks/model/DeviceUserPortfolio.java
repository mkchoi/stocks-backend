package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "device_user_portfolio", catalog = "sb")
@IdClass(DeviceUserPortfolioId.class)
public class DeviceUserPortfolio implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long userPortfolioId;
	private long userId;
	private long portfolioId;
	private Date createTime;

	public DeviceUserPortfolio() {
	}

	public DeviceUserPortfolio(String deviceId, long userPortfolioId) {
		this.deviceId = deviceId;
		this.userPortfolioId = userPortfolioId;
	}

	public DeviceUserPortfolio(String deviceId, long userPortfolioId, long userId, long portfolioId, Date createTime) {
		this.deviceId = deviceId;
		this.userPortfolioId = userPortfolioId;
		this.userId = userId;
		this.portfolioId = portfolioId;
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
	@Column(name = "user_portfolio_id")
	public long getUserPortfolioId() {
		return userPortfolioId;
	}

	public void setUserPortfolioId(long userPortfolioId) {
		this.userPortfolioId = userPortfolioId;
	}

	@Column(name = "user_id")
	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name = "portfolio_id")
	public long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	@Column(name = "create_time")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	

	
}
