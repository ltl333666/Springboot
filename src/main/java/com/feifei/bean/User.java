package com.feifei.bean;

import java.util.Date;

public class User {
	
	private Integer id;
	private String id_card;
	private String password;
	private String name;
	private String number;
	private String email;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", id_card=" + id_card + ", password=" + password + ", name=" + name + ", number="
				+ number + ", email=" + email + ", date=" + date + "]";
	}
	
	
	
}
