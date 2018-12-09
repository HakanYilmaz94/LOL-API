package com.lol.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lol.dto.SummonerDTO;
import com.lol.util.LolConstants;

@Service
public class SummonerService {

	@Value("${lol.api.key}")
	private String apiKey;

	@Autowired
	CommonService commonService;

	public SummonerDTO getSummonerInfo(String username) {

		String request = LolConstants.SUMMONERS_API + username + "?api_key=" + apiKey;
		SummonerDTO summoner = (SummonerDTO) commonService.getResponse(request, SummonerDTO.class);
		return summoner;

	}
}
