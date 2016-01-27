package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "device_user_portfolio", catalog = "sb")
public class DeviceUserPortfolio implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String deviceId;
	private Long userPortfolioId;
	private Long userId;
	private Long portfolioId;
	private Date createTime;

	public DeviceUserPortfolio() {
	}

	public DeviceUserPortfolio(String deviceId, Long userPortfolioId) {
		this.deviceId = deviceId;
		this.userPortfolioId = userPortfolioId;
	}

	public DeviceUserPortfolio(String deviceId, Long userPortfolioId, Long userId, Long portfolioId, Date createTime) {
		this.deviceId = deviceId;
		this.userPortfolioId = userPortfolioId;
		this.userId = userId;
		this.portfolioId = portfolioId;
		this.createTime = createTime;
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

	@Column(name = "user_portfolio_id")
	public Long getUserPortfolioId() {
		return userPortfolioId;
	}

	public void setUserPortfolioId(Long userPortfolioId) {
		this.userPortfolioId = userPortfolioId;
	}

	@Column(name = "user_id")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "portfolio_id")
	public Long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(Long portfolioId) {
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
