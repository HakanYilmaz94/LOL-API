package com.lol.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lol.dto.MatchDTO;
import com.lol.interfaces.ICommonService;
import com.lol.interfaces.IMatchService;
import com.lol.util.LolConstants;

@Service
public class MatchService implements IMatchService{

	@Value("${lol.api.key}")
	private String apiKey;
	
	@Autowired
	ICommonService commonService;
	
	@Override
	public MatchDTO getMatchInfoByMatchId(Long matchId) {
		
		String request = LolConstants.SPECTATOR_CURRENTGAME_API + matchId + "?api_key=" + apiKey;
		MatchDTO match = (MatchDTO) commonService.getResponse(request,MatchDTO.class);
		return match;
	}
	

}
