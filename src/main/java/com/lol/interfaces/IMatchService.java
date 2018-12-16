package com.lol.interfaces;

import com.lol.dto.MatchDTO;

public interface IMatchService {

	MatchDTO getMatchInfoByMatchId(Long matchId);

}
