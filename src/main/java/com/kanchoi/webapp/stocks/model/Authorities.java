package com.kanchoi.webapp.stocks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "authorities", catalog = "sb")
public class Authorities implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	private String username;
	private String authority;
	

	public Authorities() {
	}

	public Authorities(String username, String authority) {
		this.username = username;
		this.authority = authority;
	}

	@Id
	@Column(name = "username", nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "authority", nullable = false, length = 100)
	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	
}
