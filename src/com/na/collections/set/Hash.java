package com.na.collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class Hash {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<String> hashSetString = new HashSet<>();
		hashSetString.add("JavaScript");
		hashSetString.add("ReactJS");
		hashSetString.add("NodeJS");
		hashSetString.add("MongoDB");
		hashSetString.add("Express Framework");
		System.out.println("Các phần tử có trong hashSetIntegers là : " + hashSetString);
		System.out.println("Nhập phần tử cần xóa: ");
		String string = scanner.nextLine();
		if(hashSetString.contains(string)) {
			hashSetString.remove(string);
			System.out.println("Xóa thành công!");
			System.out.println("Các phần tử còn lại trong hashSetString là : " + hashSetString);
		} else {
			System.out.println("Phấn tử có giá trị " + string + " không tồn tại ở trong hasSetIntegers");
		}
		scanner.close();
	}
}
