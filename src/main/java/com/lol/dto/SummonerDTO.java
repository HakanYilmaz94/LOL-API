package com.lol.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author HakanYilmaz
 * SUMMONER-V4 Response
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SummonerDTO {
	private String id;
	private String accountId;
	private String name;
	private String puuid;
	private int profileIconId;
	private long revisionDate;
	private long summonerLevel;
}