package com.mindtree.entity;

import java.util.List;

public class MatchList {
	
	List<Match> matches;

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	public MatchList(List<Match> matches) {
		super();
		this.matches = matches;
	}

	public MatchList() {
		super();
	}
	
	

}
