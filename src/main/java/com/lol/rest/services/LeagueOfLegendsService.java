package com.lol.rest.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.lol.dto.SummonerDto;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class LeagueOfLegendsService {

	@Value("${lol.api.key}")
	private String apiKey;

	public static String SUMMONERS_API = "https://tr1.api.riotgames.com/lol/summoner/v3/summoners/by-name/";

	public SummonerDto getSummoners(String username) {
		StringBuffer response = null;
		try {
			URL url = new URL(SUMMONERS_API + username + "?api_key=" + apiKey);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
		} catch (Exception ex) {
			log.error("", ex.getMessage());
			return null;	
		}
		Gson gson = new Gson();
		SummonerDto summonerDto = gson.fromJson(response.toString(), SummonerDto.class);
		System.out.println(response.toString());
		return summonerDto;

	}
}
