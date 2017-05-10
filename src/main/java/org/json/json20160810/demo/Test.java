package org.json.json20160810.demo;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class Test {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("小明");
		person.setAge(23);
		List<String> major = new ArrayList<String>();
		major.add("数学");
		major.add("物理");
		person.setMajor(major);
		person.setHas_girlfriend(true);
		House house = new House("15#204", "xx家园", 1000000);
		person.setHouse(house);
		person.setBirthday("1993-04-05");

		/**
		 * obj to json
		 */
		JSONObject jsonObject = new JSONObject(person);
		System.out.println(jsonObject.toString());

		String name = jsonObject.getString("name");
		System.out.println("name:" + name);
		
		/**
		 * str to json
		 */
		String str = "{\"id\":10086,\"name\":\"中国移动\",\"address\":\"China\"}";
		JSONObject jsonObject2 = new JSONObject(str);
		System.out.println(jsonObject2.getString("name"));
		
	}
}
