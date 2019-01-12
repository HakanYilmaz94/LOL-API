package com.lol.interfaces;

import com.lol.dto.MatchDTO;
import com.lol.dto.MatchListDTO;

public interface IMatchService {

	MatchDTO getMatchInfoByMatchId(Long matchId);

	MatchListDTO getMatchListsByAccoundID(String accountID);

}
