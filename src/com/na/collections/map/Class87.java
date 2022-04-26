package com.na.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class87 {

	public static void main(String[] args) {
		HashMap<String, String> hashMapCity = new HashMap<>();
		hashMapCity.put("HN", "Hà Nội");
		hashMapCity.put("HCM", "Hồ Chí Minh");
		hashMapCity.put("DN", "Đà Nẵng");
		hashMapCity.put("HA", "Hội An");
		Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
		System.out.println(setCity);
		System.out.println("HN: " + hashMapCity.get("HN"));
		// null vì không có key nào là HN2
		System.out.println("HN2: " + hashMapCity.get("HN2"));
		
		if(hashMapCity.containsValue("Đà Nẵng")) {
			System.out.println("Có Thành Phố Đà Nẵng trong hashMapCity");
		}
	}

}
