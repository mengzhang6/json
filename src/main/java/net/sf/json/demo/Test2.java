package net.sf.json.demo;

import com.fasterxml.jackson.demo.Student;

import net.sf.json.JSONObject;

public class Test2 {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(10086);
		student.setName("中国移动");
		student.setAddress("China");
		JSONObject jsonObject = JSONObject.fromObject(student);
		System.out.println(jsonObject);
		System.out.println(jsonObject.getInt("id"));
		System.out.println(jsonObject.getString("name"));
	}

}
