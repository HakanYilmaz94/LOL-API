package com.lol.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lol.dto.SummonerDTO;
import com.lol.interfaces.ICommonService;
import com.lol.interfaces.ISummonerService;
import com.lol.util.LolConstants;

@Service
public class SummonerService implements ISummonerService {

	@Value("${lol.api.key}")
	private String apiKey;

	@Autowired
	ICommonService commonService;

	@Override
	public SummonerDTO getSummonerInfoByUsername(String username) {

		String request = LolConstants.SUMMONER_BY_SUMMENOR_NAME_API + username + "?api_key=" + apiKey;
		SummonerDTO summoner = (SummonerDTO) commonService.getResponse(request, SummonerDTO.class);
		return summoner;

	}

	@Override
	public SummonerDTO getSummonerInfoByAccountId(String accountId) {
		String request = LolConstants.SUMMONER_BY_ACCOUNT_ID_API + accountId + "?api_key=" + apiKey;
		SummonerDTO summoner = (SummonerDTO) commonService.getResponse(request, SummonerDTO.class);
		return summoner;

	}

	@Override
	public SummonerDTO getSummonerInfoBySummonerId(String summonerId) {
		String request = LolConstants.SUMMONER_BY_SUMMONER_ID_API + summonerId + "?api_key=" + apiKey;
		SummonerDTO summoner = (SummonerDTO) commonService.getResponse(request, SummonerDTO.class);
		return summoner;
	}

}
