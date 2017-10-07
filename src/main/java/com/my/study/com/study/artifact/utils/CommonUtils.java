package com.my.study.com.study.artifact.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CommonUtils {
	public static String getData(String urI) throws IOException {
		// complete this
		URL url = new URL(urI);

		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

		String inputLine;

		StringBuilder content = new StringBuilder();

		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();

		return content.toString();

	}
}
