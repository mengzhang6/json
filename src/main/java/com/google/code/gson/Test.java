package com.google.code.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



public class Test {

	public static void main(String[] args) {
		String str = "{\"errorCode\":0,\"errorInfo\":\"操作成功\",\"result\":{\"list\":[{\"id\":1001,\"name\":\"ming\"},{\"id\":1002,\"name\":\"hua\"},{\"id\":1003,\"name\":\"jun\"}],\"totalCount\":3}}";
		
		JsonParser parse =new JsonParser();  //创建json解析器
		JsonObject jsonObject = (JsonObject) parse.parse(str);
		
		String errorInfo = jsonObject.get("errorInfo").getAsString();
		System.out.println(errorInfo);
		
		JsonObject temp = jsonObject.getAsJsonObject("result");
		JsonArray jsonArray = temp.getAsJsonArray("list");
		System.out.println(jsonArray.get(0));
		
		if(jsonArray.get(0).isJsonObject()){
			String id = jsonArray.get(0).getAsJsonObject().get("id").getAsString();
			System.out.println(id);
		}
	}

}
