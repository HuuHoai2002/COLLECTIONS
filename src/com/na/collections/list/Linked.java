package com.na.collections.list;

import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("JavaScript");
		list.add("ReactJS");
		list.add("NodeJS");
		list.add("Express");
		// Thêm phần tử của list vào listA
		LinkedList<String> listA = new LinkedList<>();
		listA.addAll(list);
		System.out.println("List A: ");
		for (String string : listA) {
			System.out.print(string + " ");
		}
		
		// Khởi tạo listB , 
		LinkedList<String> listB = new LinkedList<>();
		listB.add("JavaScript");
		// Xóa những phần tử không thuộc listB khỏi listA
		listA.retainAll(listB);
		System.out.println("List A: ");
		for (String string : listA) {
			System.out.print(string + " ");
		}
		
		// Xóa những phần tử thuộc listB khỏi list
		list.removeAll(listB);
		System.out.println("List B: ");
		for (String string : list) {
			System.out.print(string + " ");
		}
	}
}
