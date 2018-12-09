package com.lol.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SummonerDTO {
	private long id;
	private long accountId;
	private String name;
	private long profileIconId;
	//private Date revisionDate;
	private int summonerLevel;
}