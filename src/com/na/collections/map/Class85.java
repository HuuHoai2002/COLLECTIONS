package com.na.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class85 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("WPF", "CSharp");
		hashMap.put("Flutter", "Dart");
		hashMap.put("React Native", "JavaScript");
		hashMap.put("ReactJS", "JavaScript");
		hashMap.put("NodeJS", "JavaScript");
		Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
		System.out.println("Các entry có trong setHashMap : " + setHashMap);
	}
}
