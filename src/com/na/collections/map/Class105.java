package com.na.collections.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Class105 {
	public static void main(String[] args) {
		TreeMap<Integer , Character> treeMap = new TreeMap<>();
		treeMap.put(6, 'A');
		treeMap.put(4, 'B');
		treeMap.put(8, 'D');
		treeMap.put(0, 'T');
		treeMap.put(2, 'S');
		Set<Entry<Integer, Character>> setTreeMap = treeMap.entrySet();	
		// tăng dần theo khóa
		System.out.println("Các entry có trong setTreeMap là : " + setTreeMap);
	}
}
