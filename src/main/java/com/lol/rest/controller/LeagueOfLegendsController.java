package com.lol.rest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lol.dto.SummonerDTO;
import com.lol.rest.services.SummonerService;
import com.lol.vo.ClientVO;

@RestController
@RequestMapping
public class LeagueOfLegendsController {
	@Autowired
	SummonerService leagueOfLegendsService;

	@PostMapping(path = "getSummonersInfo")
	public Response getSummonersInfo(@RequestBody ClientVO client) {
		if(client.getUsername() == null) {
			return new Response("Error","Başarısız Data");
		}
		SummonerDTO returnBody = leagueOfLegendsService.getSummonerInfo(client.getUsername());
		if(returnBody==null) {
			return new Response("Error","Başarısız Data");
		}
		return new Response("Done",returnBody.getName());
	}

}
