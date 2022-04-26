package com.na.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetExp1 {
	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("JavaScript");
		linkedHashSet.add("NodeJS");
		linkedHashSet.add("ReactJS");
		linkedHashSet.add("Mongoose");
		for (String string : linkedHashSet) {
			System.out.println(string);
		}
	}
}
