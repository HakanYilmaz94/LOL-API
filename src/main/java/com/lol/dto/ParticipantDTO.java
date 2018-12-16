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
public class ParticipantDTO {

	private ParticipantStatsDTO stats;
	private int participantId;
	private List<RuneDTO> runes;
	private ParticipantTimelineDTO timeline;
	private int teamId;
	private int spell2Id;
	private List<MasteryDTO> masteries;
	private String highestAchievedSeasonTier;
	private int spell1Id;
	private int championId;

}