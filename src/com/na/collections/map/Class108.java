package com.na.collections.map;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Class108 {
	public static void main(String[] args) {
		TreeMap<Integer , Double> treeMap = new TreeMap<>();
		treeMap.put(6, 8d);
		treeMap.put(4, 15d);
		treeMap.put(8, 4d);
		Set<Entry<Integer, Double>> setTreeMap = treeMap.entrySet();	
		// tăng dần theo khóa
		System.out.println("Các entry có trong setTreeMap là : " + setTreeMap);
		// thay thế value của entry có khóa là 4
		treeMap.replace(4, 84d);
		System.out.println("Các phần tử sau khi thay thế là : " + setTreeMap);
	}
}
