package org.json.simple.demo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class Test {

	public static void main(String[] args) {
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		map.put("id", 2012211);
		map.put("name", "Cheney");
		map.put("address", "Anhui");
		JSONObject obj = new JSONObject(map);
		System.out.println(obj);
		System.out.println(obj.get("name"));
	}

}
