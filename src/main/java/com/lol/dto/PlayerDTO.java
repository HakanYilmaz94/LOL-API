package com.lol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlayerDTO {
	
	private String currentPlatformId;
	private String summonerName;
	private String matchHistoryUri;
	private String platformId;
	private String currentAccountId;
	private String profileIcon;
	private String summonerId;
	private String accountId;

}
