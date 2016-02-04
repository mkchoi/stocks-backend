package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "device_profit_loss")
public class DeviceProfitLoss implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "device_id", nullable = false, length = 50)
	private String deviceId;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "portfolio_id")
	private Long portfolioId;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "status", unique = false, nullable = true, length = 10 )
	private String status;
	
	@Column(name = "update_time")
	private Date updateTime;

	public DeviceProfitLoss() {
	}

	public DeviceProfitLoss(String deviceId, Long userId, Long portfolioId, Double amount, String status, Date updateTime) {
		this.deviceId = deviceId;
		this.userId = userId;
		this.portfolioId = portfolioId;
		this.amount = amount;
		this.status = status;
		this.updateTime = updateTime;
		
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

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(Long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	

	
}
