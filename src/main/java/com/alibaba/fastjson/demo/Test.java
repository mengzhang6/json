package com.alibaba.fastjson.demo;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Test {

	public static void main(String[] args) {
		String str = "{\"errorCode\":0,\"errorInfo\":\"操作成功\",\"result\":{\"list\":[{\"id\":1001,\"name\":\"ming\"},{\"id\":1002,\"name\":\"hua\"},{\"id\":1003,\"name\":\"jun\"}],\"totalCount\":3}}";
		
		JSONObject jsonObject = JSONObject.parseObject(str);
		String errorInfo = jsonObject.getString("errorInfo");
		System.out.println(errorInfo);
		
		JSONObject temp = jsonObject.getJSONObject("result");
		JSONArray jsonArray = temp.getJSONArray("list");
		System.out.println(jsonArray.getJSONObject(0));
		System.out.println(jsonArray.getJSONObject(0).get("id"));
	}

}
