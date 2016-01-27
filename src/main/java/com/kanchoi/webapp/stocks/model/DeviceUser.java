package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "device_user", catalog = "sb")
public class DeviceUser implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String deviceId;
	private Long userId;
	private String name;
	private byte[] photo;
	private String type;
	private String share;
	private String email;
	private String addTradingFee;
	private String greenAsRise;
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

	@Column(name = "user_id")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "name", unique = false, nullable = true, length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "photo")
	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Column(name = "type", unique = false, nullable = true, length = 20)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "share", unique = false, nullable = true, length = 3)
	public String getShare() {
		return share;
	}

	public void setShare(String share) {
		this.share = share;
	}

	@Column(name = "email", unique = false, nullable = true, length = 100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "add_trading_fee", unique = false, nullable = true, length = 3)
	public String getAddTradingFee() {
		return addTradingFee;
	}

	public void setAddTradingFee(String addTradingFee) {
		this.addTradingFee = addTradingFee;
	}

	@Column(name = "green_as_rise", unique = false, nullable = true, length = 3)
	public String getGreenAsRise() {
		return greenAsRise;
	}

	public void setGreenAsRise(String greenAsRise) {
		this.greenAsRise = greenAsRise;
	}

	@Column(name = "create_time")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


}
