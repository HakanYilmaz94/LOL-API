package com.lol.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MatchDTO {
	
	private int seasonId;
	private int queueId;
	private Long gameId;
	private List<ParticipantIdentityDTO> participantIdentities;
	private String gameVersion;
	private String platformId;
	private String gameMode;
	private int mapId;
	private String gameType;
	private List<TeamStatsDTO> teams;
	private List<ParticipantDTO> participants;
	private Long gameDuration;
	private Long gameCreation;
	

}
