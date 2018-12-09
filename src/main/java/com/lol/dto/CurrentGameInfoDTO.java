package com.lol.dto;

import java.util.List;

import com.lol.dto.common.BannedChampion;
import com.lol.dto.common.CurrentGameParticipantDTO;
import com.lol.dto.common.ObserverDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author HakanYilmaz
 * SPECTATOR-V4 Response
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CurrentGameInfoDTO {

	private long gameId;
	private long gameStartTime;
	private String platformId;
	private String gameMode;
	private long mapId;
	private String gameType;
	private List<BannedChampion> bannedChampions;
	private ObserverDTO observers;
	private List<CurrentGameParticipantDTO> participants;
	private long gameLength;
	private long gameQueueConfigId;
}
