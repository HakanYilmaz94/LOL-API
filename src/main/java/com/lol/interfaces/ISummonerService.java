package com.lol.interfaces;

import com.lol.dto.SummonerDTO;

public interface ISummonerService {

	SummonerDTO getSummonerInfoByUsername(String username);

	SummonerDTO getSummonerInfoBySummonerId(String summonerId);

	SummonerDTO getSummonerInfoByAccountId(String accountId);

}
