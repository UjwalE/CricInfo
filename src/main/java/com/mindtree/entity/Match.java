package com.mindtree.entity;

import java.util.Date;

public class Match {
	
	int unique_id;
	String team_1;
	String team_2;
	Date date;
	boolean matchStarted;
	
	
	public Match() {
		super();
	}
	
	public Match(int unique_id, String team_1, String team_2, Date date, boolean matchStarted) {
		super();
		this.unique_id = unique_id;
		this.team_1 = team_1;
		this.team_2 = team_2;
		this.date = date;
		this.matchStarted = matchStarted;
	}
	public int getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(int unique_id) {
		this.unique_id = unique_id;
	}
	public String getteam_1() {
		return team_1;
	}
	public void setteam_1(String team_1) {
		this.team_1 = team_1;
	}
	public String getteam_2() {
		return team_2;
	}
	public void setteam_2(String team_2) {
		this.team_2 = team_2;
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
