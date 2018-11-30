package com.mindtree.entity;

public class Player {
	
	String pid;
	String name;
	String fullName;
	public Player(String pid, String name, String fullName) {
		super();
		this.pid = pid;
		this.name = name;
		this.fullName = fullName;
	}
	public Player() {
		super();
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}	

}
