package com.lol.rest.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.lol.interfaces.ICommonService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CommonService implements ICommonService {

	@Override
	public Object getResponse(String request, Class<?> classType) {
		StringBuffer response = null;
		try {
			URL url = new URL(request);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");

			log.info("Request:" + request);

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
		log.info("Response:" + response.toString());
		Object responseObject = gson.fromJson(response.toString(), classType);
		return responseObject;

	}

}
