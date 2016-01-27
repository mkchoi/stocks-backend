package com.kanchoi.webapp.stocks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users", catalog = "sb")
public class Users implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private Integer enabled;

	public Users() {
	}

	public Users(String username, String password, Integer enabled) {
		this.username = username;
		this.password = password;
		this.setEnabled(enabled);
	}

	@Id
	@Column(name = "username", nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "enabled")
	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	
}
