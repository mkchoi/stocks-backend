package com.kanchoi.webapp.stocks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "device_cost", catalog = "sb")
public class DeviceCost implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String deviceId;
	private long costId;
	private double tranCost;
	private double tax;
	private double commission;
	private double minChar;

	public DeviceCost() {
	}

	public DeviceCost(String deviceId, long costId) {
		this.deviceId = deviceId;
		this.costId = costId;
	}

	public DeviceCost(String deviceId, long costId, double tranCost, double tax, double commission, double minChar) {
		this.deviceId = deviceId;
		this.costId = costId;
		this.tranCost = tranCost;
		this.tax = tax;
		this.commission = commission;
		this.minChar = minChar;
		
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

	@Column(name = "cost_id")
	public long getCostId() {
		return this.costId;
	}

	public void setCostId(long costId) {
		this.costId = costId;
	}

	@Column(name = "tran_cost")
	public double getTranCost() {
		return this.tranCost;
	}

	public void setTranCost(double tranCost) {
		this.tranCost = tranCost;
	}

	@Column(name = "tax")
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Column(name = "commission")
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	@Column(name = "min_char")
	public double getMinChar() {
		return minChar;
	}

	public void setMinChar(double minChar) {
		this.minChar = minChar;
	}
	

	
}
