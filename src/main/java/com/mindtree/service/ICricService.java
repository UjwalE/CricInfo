package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Match;
import com.mindtree.entity.Player;

public interface ICricService {

	List<Match> getMatches();

	List<Player> searchPlayer(String name);

}
