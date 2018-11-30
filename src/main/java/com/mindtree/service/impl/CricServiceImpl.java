package com.mindtree.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.mindtree.entity.Match;
import com.mindtree.entity.Player;
import com.mindtree.entity.PlayerList;
import com.mindtree.service.ICricService;

@Service
public class CricServiceImpl implements ICricService {

	public List<Match> getMatches() {
		RestTemplate rest = new RestTemplate();
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://cricapi.com/api/matches")
		        .queryParam("apikey", "v6iuXmcZitN669cIyDgs3bGYdh23");

		List<Match> list = rest.getForObject(builder.toUriString(),ArrayList.class);
		
		return list;
	}
	
	
	public List<Player> searchPlayer(String name) {
		RestTemplate rest = new RestTemplate();
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://cricapi.com/api/playerFinder")
				.queryParam("name", name)
		        .queryParam("apikey", "v6iuXmcZitN669cIyDgs3bGYdh23");

		PlayerList plist = rest.getForObject(builder.toUriString(),PlayerList.class);
		
		return plist.getData();
	}

}
