package com.lol.rest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lol.dto.SummonerDto;
import com.lol.rest.services.LeagueOfLegendsService;
import com.lol.vo.ClientVO;

@RestController
@RequestMapping(path = "getSummonersInfo")
public class LeagueOfLegendsController {
	@Autowired
	LeagueOfLegendsService leagueOfLegendsService;

	@PostMapping
	public Response getSummonersInfo(@RequestBody ClientVO client) {
		if(client.getUsername() == null) {
			return new Response("Error","Başarısız Data");
		}
		SummonerDto returnBody = leagueOfLegendsService.getSummoners(client.getUsername());
		if(returnBody==null) {
			return new Response("Error","Başarısız Data");
		}
		return new Response("Done",returnBody.getName());
	}

}
