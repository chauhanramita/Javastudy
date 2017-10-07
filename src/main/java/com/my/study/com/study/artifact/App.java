package com.my.study.com.study.artifact;

import java.io.IOException;

import com.my.study.com.study.artifact.utils.CommonUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String url = "https://api.github.com/";
		try {
			String result = CommonUtils.getData(url);
			System.out.println(result);

			result = CommonUtils.getData("https://www.yahoo.com");
			System.out.println(result);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
