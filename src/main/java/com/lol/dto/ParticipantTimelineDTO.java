package com.lol.dto;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ParticipantTimelineDTO {

	private String lane;
	private int participantId;
	private Map<String, Double> csDiffPerMinDeltas;
	private Map<String, Double> goldPerMinDeltas;
	private Map<String, Double> xpDiffPerMinDeltas;
	private Map<String, Double> creepsPerMinDeltas;
	private Map<String, Double> xpPerMinDeltas;
	private String role;
	private Map<String, Double> damageTakenDiffPerMinDeltas;
	private Map<String, Double> damageTakenPerMinDeltas;

}
