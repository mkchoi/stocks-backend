package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "forum_message", catalog = "sb")
public class ForumMessage implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;
	private long topicId;
	private String message;
	private String userEmail;
	private Date createTime;
	private String deviceId;
	private long messageId;

	public ForumMessage() {
	}

	public ForumMessage(long id, long topicId, String message, String userEmail, Date createTime, String deviceId, long messageId) {
		this.id = id;
		this.topicId = topicId;
		this.message = message;
		this.userEmail = userEmail;
		this.createTime = createTime;
		this.deviceId = deviceId;
		this.setMessageId(messageId);
		
	}

	@Id
	@Column(name = "id")
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "topic_id")
	public long getTopicId() {
		return topicId;
	}

	public void setTopicId(long topicId) {
		this.topicId = topicId;
	}
	
	@Column(name = "message", nullable = false, length = 500)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "user_email", nullable = false, length = 100)
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "create_time")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "device_id", nullable = true, length= 50)
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Column(name = "message_id")
	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	
}
