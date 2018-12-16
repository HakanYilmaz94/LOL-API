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
public class TeamStatsDTO {

	private Boolean firstDragon;
	private Boolean firstInhibitor;
	private List<TeamBansDTO> bans;
	private int baronKills;
	private Boolean firstRiftHerald;
	private boolean firstBaron;
	private int riftHeraldKills;
	private boolean firstBlood;
	private int teamId;
	private boolean firstTower;
	private int vilemawKills;
	private int inhibitorKills;
	private int towerKills;
	private int dominionVictoryScore;
	private String win;
	private int dragonKills;

}


