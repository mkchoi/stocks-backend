package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "device_user")
public class DeviceUser implements java.io.Serializable
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
	
	@Column(name = "name", unique = false, nullable = true, length = 50)
	private String name;
	
	@Column(name = "photo")
	private byte[] photo;
	
	@Column(name = "type", unique = false, nullable = true, length = 20)
	private String type;
	
	@Column(name = "share", unique = false, nullable = true, length = 3)
	private String share;
	
	@Column(name = "email", unique = false, nullable = true, length = 100)
	private String email;
	
	@Column(name = "add_trading_fee", unique = false, nullable = true, length = 3)
	private String addTradingFee;
	
	@Column(name = "green_as_rise", unique = false, nullable = true, length = 3)
	private String greenAsRise;
	
	@Column(name = "create_time")
	private Date createTime;

	public DeviceUser() {
	}

	public DeviceUser(String deviceId, Long userId) {
		this.deviceId = deviceId;
		this.userId = userId;
	}

	public DeviceUser(String deviceId, Long userId, String name, byte[] photo, String type, String share, 
			String addTradingFee, String greenAsRise, Date createTime) {
		this.deviceId = deviceId;
		this.userId = userId;
		this.name = name;
		this.photo = photo;
		this.type = type;
		this.share = share;
		this.addTradingFee = addTradingFee;
		this.greenAsRise = greenAsRise;
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

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getShare() {
		return share;
	}

	public void setShare(String share) {
		this.share = share;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddTradingFee() {
		return addTradingFee;
	}

	public void setAddTradingFee(String addTradingFee) {
		this.addTradingFee = addTradingFee;
	}

	public String getGreenAsRise() {
		return greenAsRise;
	}

	public void setGreenAsRise(String greenAsRise) {
		this.greenAsRise = greenAsRise;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


}
