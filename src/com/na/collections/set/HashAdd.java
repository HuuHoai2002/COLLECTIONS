package com.na.collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class HashAdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		HashSet<Integer> hasSetIntegers = new HashSet<>();
		hasSetIntegers.add(0);
		hasSetIntegers.add(5);
		hasSetIntegers.add(4);
		hasSetIntegers.add(1);
		hasSetIntegers.add(2);
		System.out.println("Các phần tử có trong hashSetIntegers là : " + hasSetIntegers);
		System.out.println("Nhập phần tử cần thêm: ");
		number = scanner.nextInt();
		if(!hasSetIntegers.contains(number)) {
			hasSetIntegers.add(number);
			System.out.println("Thêm thành công!");
			System.out.println("Sau khi thêm: ");
			System.out.println(hasSetIntegers);
		} else {
			System.out.println("Phấn tử có giá trị " + number + " đã tồn tại ở trong hasSetIntegers");
		}
		scanner.close();
	}
}	
