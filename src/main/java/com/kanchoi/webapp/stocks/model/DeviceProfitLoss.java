package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "device_profit_loss", catalog = "sb")
public class DeviceProfitLoss implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String deviceId;
	private Long profitLossId;
	private Long userId;
	private Long portfolioId;
	private Double amount;
	private String status;
	private Date updateTime;

	public DeviceProfitLoss() {
	}

	public DeviceProfitLoss(String deviceId, Long profitLossId) {
		this.deviceId = deviceId;
		this.profitLossId = profitLossId;
	}

	public DeviceProfitLoss(String deviceId, Long profitLossId, Long userId, Long portfolioId, Double amount, String status, Date updateTime) {
		this.deviceId = deviceId;
		this.profitLossId = profitLossId;
		this.userId = userId;
		this.portfolioId = portfolioId;
		this.amount = amount;
		this.status = status;
		this.updateTime = updateTime;
		
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

	@Column(name = "profit_loss_id")
	public Long getProfitLossId() {
		return this.profitLossId;
	}

	public void setProfitLossId(Long profitLossId) {
		this.profitLossId = profitLossId;
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

	@Column(name = "amount")
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
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
