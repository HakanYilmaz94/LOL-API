package com.lol.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lol.dto.CurrentGameInfoDTO;
import com.lol.util.LolConstants;

@Service
public class SpectatorService {

	@Value("${lol.api.key}")
	private String apiKey;

	@Autowired
	CommonService commonService;

	public CurrentGameInfoDTO getCurrentGameInfo(Long summonerId) {

		String request = LolConstants.SPECTATOR_CURRENTGAME_API + summonerId + "?api_key=" + apiKey;
		CurrentGameInfoDTO currentGame = (CurrentGameInfoDTO) commonService.getResponse(request,CurrentGameInfoDTO.class);
		return currentGame;

	}

}
