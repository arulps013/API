package com.json;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader r = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\json files\\test.json");
		JSONParser p = new JSONParser();
		Object o = p.parse(r);
		JSONObject j = (JSONObject) o;

		Set ks = j.keySet();
		for (Object ob : ks) {
			System.out.println("requirements are:   " + ob);
		}
		Collection v = j.values();
		for (Object oj : v) {
			System.out.println("details are:    " + oj);
		}
		System.out.println("******Passenger details******");
		Set es = j.entrySet();
		for (Object ot : es) {
			System.out.println(ot);
		}
	}
}
