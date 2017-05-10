package net.sf.json.demo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test {

	public static void main(String[] args) {
		String str = "{\"errorCode\":0,\"errorInfo\":\"操作成功\",\"result\":{\"list\":[{\"id\":1001,\"name\":\"ming\"},{\"id\":1002,\"name\":\"hua\"},{\"id\":1003,\"name\":\"jun\"}],\"totalCount\":3}}";
		JSONObject jsonObject = JSONObject.fromObject(str);
		System.out.println(jsonObject.getString("errorInfo"));
		
		JSONObject result = JSONObject.fromObject(jsonObject.getString("result"));
		JSONArray jsonArray = JSONArray.fromObject(result.getString("list"));
		JSONObject first = JSONObject.fromObject(jsonArray.get(0));
		System.out.println(first.get("id"));
		System.out.println(first.get("name"));
	}
}
