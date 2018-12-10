package com.lol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BannedChampionDTO {

	private int pickTurn;
	private long championId;
	private long teamId;
}
