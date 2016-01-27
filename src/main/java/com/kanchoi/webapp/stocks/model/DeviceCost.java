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
	private Long costId;
	private Double tranCost;
	private Double tax;
	private Double commission;
	private Double minChar;

	public DeviceCost() {
	}

	public DeviceCost(String deviceId, Long costId) {
		this.deviceId = deviceId;
		this.costId = costId;
	}

	public DeviceCost(String deviceId, Long costId, Double tranCost, Double tax, Double commission, Double minChar) {
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
	public Long getCostId() {
		return this.costId;
	}

	public void setCostId(Long costId) {
		this.costId = costId;
	}

	@Column(name = "tran_cost")
	public Double getTranCost() {
		return this.tranCost;
	}

	public void setTranCost(Double tranCost) {
		this.tranCost = tranCost;
	}

	@Column(name = "tax")
	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Column(name = "commission")
	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	@Column(name = "min_char")
	public Double getMinChar() {
		return minChar;
	}

	public void setMinChar(Double minChar) {
		this.minChar = minChar;
	}
	

	
}
