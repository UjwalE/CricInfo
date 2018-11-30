package com.mindtree.entity;

import java.util.Date;

public class Match {
	
	int uniqueId;
	String team1;
	String team2;
	Date date;
	boolean matchStarted;
	
	
	public Match() {
		super();
	}
	
	public Match(int uniqueId, String team1, String team2, Date date, boolean matchStarted) {
		super();
		this.uniqueId = uniqueId;
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
		this.matchStarted = matchStarted;
	}
	public int getuniqueId() {
		return uniqueId;
	}
	public void setuniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getteam1() {
		return team1;
	}
	public void setteam1(String team1) {
		this.team1 = team1;
	}
	public String getteam2() {
		return team2;
	}
	public void setteam2(String team2) {
		this.team2 = team2;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isMatchStarted() {
		return matchStarted;
	}
	public void setMatchStarted(boolean matchStarted) {
		this.matchStarted = matchStarted;
	}
	
	
}
