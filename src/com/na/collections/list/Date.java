package com.na.collections.list;

import java.util.LinkedList;
import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		LinkedList<String> linkedList = new LinkedList<>();
		for(int i = 0; i < 12; i++) {
			linkedList.add("Tháng " + (i + 1));
		}
		System.out.println("Nhập chỉ số của những phần tử cần lấy: ");
		
		int index =  scanner.nextInt();
		if(index < 0 || index > (linkedList.size() - 1)) {
			System.out.println("Chỉ số phải lớn hơn 0 và nhỏ hơn " + (linkedList.size() - 1));
		} else {
			String node = linkedList.get(index);
			System.out.println("Phần tử có chỉ số " + index + " trong linekdList là : " + node);
		}
		String firstNode = linkedList.getFirst();
		System.out.println("Phần tử đầu tiên trong danh sách là : " + firstNode);
		String lastNode = linkedList.getLast();
		System.out.println("Phần tử cuối cùng trong danh sách là : " + lastNode);
		scanner.close();
	}
}
