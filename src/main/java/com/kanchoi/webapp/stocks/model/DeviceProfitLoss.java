package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "device_profit_loss", catalog = "sb")
@IdClass(DeviceProfitLossId.class)
public class DeviceProfitLoss implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String deviceId;
	private long profitLossId;
	private long userId;
	private long portfolioId;
	private double amount;
	private String status;
	private Date updateTime;

	public DeviceProfitLoss() {
	}

	public DeviceProfitLoss(String deviceId, long profitLossId) {
		this.deviceId = deviceId;
		this.profitLossId = profitLossId;
	}

	public DeviceProfitLoss(String deviceId, long profitLossId, long userId, long portfolioId, double amount, String status, Date updateTime) {
		this.deviceId = deviceId;
		this.profitLossId = profitLossId;
		this.userId = userId;
		this.portfolioId = portfolioId;
		this.amount = amount;
		this.status = status;
		this.updateTime = updateTime;
		
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
	@Column(name = "profit_loss_id")
	public long getProfitLossId() {
		return this.profitLossId;
	}

	public void setProfitLossId(long profitLossId) {
		this.profitLossId = profitLossId;
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

	@Column(name = "amount")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name = "status", unique = false, nullable = true, length = 10 )
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name = "update_time")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	

	
}
