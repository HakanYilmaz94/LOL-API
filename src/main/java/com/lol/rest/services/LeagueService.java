package com.lol.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.lol.interfaces.ICommonService;

public class LeagueService {

	@Value("${lol.api.key}")
	private String apiKey;

	@Autowired
	ICommonService commonService;

}
