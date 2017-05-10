package com.fasterxml.jackson.demo;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(10086);
		student.setName("中国移动");
		student.setAddress("China");

		ObjectMapper objectMapper = new ObjectMapper();
		JsonGenerator jsonGenerator = null;

		try {
			jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(
					System.out, JsonEncoding.UTF8);
			
			// javaObj to String
//			jsonGenerator.writeObject(student);
//			System.out.println();
//			objectMapper.writeValue(System.out, student);
//			System.out.println();
			
			String sss = objectMapper.writeValueAsString(student);
			System.out.println(sss);

			// String to javaObj
			String str = "{\"id\":10086,\"name\":\"中国移动\",\"address\":\"China\"}";
			Student stu = objectMapper.readValue(str, Student.class);
			System.out.println(stu.getId() + " " + stu.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 关闭
		try {
			if (jsonGenerator != null) {
				jsonGenerator.flush();
			}
			if (!jsonGenerator.isClosed()) {
				jsonGenerator.close();
			}
			jsonGenerator = null;
			objectMapper = null;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
