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
public class CurrentGameParticipantDTO {

	private long profileIconId;
	private long championId;
	private String summonerName;
	private List<GameCustomizationObjectDTO> gameCustomizationObjects;
	private boolean bot;
	private PerksDTO perks;
	private long spell2Id;
	private long teamId;
	private long spell1Id;
	private String summonerId;
}
