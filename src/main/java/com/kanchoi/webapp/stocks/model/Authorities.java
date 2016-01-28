package com.kanchoi.webapp.stocks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "authorities")
public class Authorities implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "username", nullable = false, length = 20)
	private String username;
	
	@Column(name = "authority", nullable = false, length = 100)
	private String authority;
	

	public Authorities() {
	}

	public Authorities(String username, String authority) {
		this.username = username;
		this.authority = authority;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	
}
