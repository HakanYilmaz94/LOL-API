package com.lol.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lol.dto.CurrentGameInfoDTO;
import com.lol.dto.SummonerDTO;
import com.lol.interfaces.ISpectatorService;
import com.lol.interfaces.ISummonerService;
import com.lol.vo.ClientVO;

@RestController
@RequestMapping
public class LeagueOfLegendsController {

	@Autowired
	ISummonerService summonerService;

	@Autowired
	ISpectatorService spectatorService;

	@PostMapping(path = "getSummonersInfo")
	public Response getSummonersInfo(@RequestBody ClientVO client) {
		if (client.getUsername() == null) {
			return new Response("Error", "client.getUsername() is null");
		}
		SummonerDTO SummonerDTO = summonerService.getSummonerInfo(client.getUsername());
		if (SummonerDTO == null) {
			return new Response("Error", "SummonerDTO is null");
		}
		CurrentGameInfoDTO currentGameInfoDTO = spectatorService.getCurrentGameInfo(SummonerDTO.getId());
		if (currentGameInfoDTO == null) {
			return new Response("Error", "currentGameInfoDTO is null");
		}
		return new Response("Done", currentGameInfoDTO.toString());
	}

}
