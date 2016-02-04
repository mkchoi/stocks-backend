package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "device_portfolio")
public class DevicePortfolio implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "device_id", nullable = false, length = 50)
	private String deviceId;
	
	@Column(name = "name", unique = false, nullable = true, length = 100)
	private String name;
	
	@Column(name = "share", unique = false, nullable = true, length = 3)
	private String share;
	
	@Column(name = "create_time")
	private Date createTime;

	public DevicePortfolio() {
	}

	public DevicePortfolio(String deviceId, String name, String share, Date createTime) {
		this.deviceId = deviceId;
		this.name = name;
		this.share = share;
		this.createTime = createTime;
		
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
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getShare() {
		return this.share;
	}

	public void setShare(String share) {
		this.share = share;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
