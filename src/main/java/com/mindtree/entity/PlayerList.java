package com.mindtree.entity;

import java.util.List;

public class PlayerList {
	
	List<Player> data;

	public PlayerList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayerList(List<Player> data) {
		super();
		this.data = data;
	}

	public List<Player> getData() {
		return data;
	}

	public void setData(List<Player> data) {
		this.data = data;
	}

}
