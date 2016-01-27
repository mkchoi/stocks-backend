package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "forum_topic", catalog = "sb")
public class ForumTopic implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String topicName;
	private String userEmail;
	private Date createTime;
	private String deviceId;
	private long topicId;

	public ForumTopic() {
	}

	public ForumTopic(long id, String topicName, String userEmail, Date createTime, String deviceId, long topicId) {
		this.id = id;
		this.topicName = topicName;
		this.userEmail = userEmail;
		this.createTime = createTime;
		this.deviceId = deviceId;
		this.topicId = topicId;
		
	}

	@Id
	@Column(name = "id")
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "topic_name", nullable = false, length = 500)
	public String getTopicName() {
		return this.topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
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

	@Column(name = "topic_id")
	public long getTopicId() {
		return topicId;
	}

	public void setTopicId(long topicId) {
		this.topicId = topicId;
	}
	

	
}
