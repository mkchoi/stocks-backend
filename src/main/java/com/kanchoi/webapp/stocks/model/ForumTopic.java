package com.kanchoi.webapp.stocks.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "forum_topic", catalog = "sb")
public class ForumTopic implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "topic_name", nullable = false, length = 500)
	private String topicName;
	
	@Column(name = "user_email", nullable = false, length = 100)
	private String userEmail;
	
	@Column(name = "create_time")
	private Date createTime;
	
	@Column(name = "device_id", nullable = true, length= 50)
	private String deviceId;
	
	@Column(name = "topic_id")
	private Long topicId;

	public ForumTopic() {
	}

	public ForumTopic(Long id, String topicName, String userEmail, Date createTime, String deviceId, Long topicId) {
		this.id = id;
		this.topicName = topicName;
		this.userEmail = userEmail;
		this.createTime = createTime;
		this.deviceId = deviceId;
		this.topicId = topicId;
		
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTopicName() {
		return this.topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
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

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	

	
}
