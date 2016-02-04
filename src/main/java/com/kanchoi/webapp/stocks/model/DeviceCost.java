package com.kanchoi.webapp.stocks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "device_cost")
public class DeviceCost implements java.io.Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "device_id", nullable = false, length = 50)
	private String deviceId;
	
	@Column(name = "tran_cost")
	private Double tranCost;
	
	@Column(name = "tax")
	private Double tax;
	
	@Column(name = "commission")
	private Double commission;
	
	@Column(name = "minChar")
	private Double minChar;

	public DeviceCost() {
	}

	public DeviceCost(String deviceId, Double tranCost, Double tax, Double commission, Double minChar) {
		this.deviceId = deviceId;
		this.tranCost = tranCost;
		this.tax = tax;
		this.commission = commission;
		this.minChar = minChar;
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

	public Double getTranCost() {
		return this.tranCost;
	}

	public void setTranCost(Double tranCost) {
		this.tranCost = tranCost;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public Double getMinChar() {
		return minChar;
	}

	public void setMinChar(Double minChar) {
		this.minChar = minChar;
	}
	

	
}
