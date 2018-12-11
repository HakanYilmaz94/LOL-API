package com.lol.interfaces;

import com.lol.dto.CurrentGameInfoDTO;

public interface ISpectatorService {

	CurrentGameInfoDTO getCurrentGameInfo(String summonerId);

}
