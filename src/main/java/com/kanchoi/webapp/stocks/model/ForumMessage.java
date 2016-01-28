package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "forum_message")
public class ForumMessage implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "topic_id")
	private Long topicId;
	
	@Column(name = "message", nullable = false, length = 500)
	private String message;
	
	@Column(name = "user_email", nullable = false, length = 100)
	private String userEmail;
	
	@Column(name = "create_time")
	private Date createTime;
	
	@Column(name = "device_id", nullable = true, length= 50)
	private String deviceId;
	
	@Column(name = "message_id")
	private Long messageId;

	public ForumMessage() {
	}

	public ForumMessage(Long id, Long topicId, String message, String userEmail, Date createTime, String deviceId, Long messageId) {
		this.id = id;
		this.topicId = topicId;
		this.message = message;
		this.userEmail = userEmail;
		this.createTime = createTime;
		this.deviceId = deviceId;
		this.setMessageId(messageId);
		
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}
	
}
