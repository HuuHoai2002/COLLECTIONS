package com.na.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrIntegers = new ArrayList<>();
		System.out.println("Nhập vào số phần tử: ");
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập vào phần tử thứ " + (i + 1) + " : ");
			int phanTu = scanner.nextInt();
			arrIntegers.add(phanTu);
		}
		int max = arrIntegers.get(0);
		for (Integer integer : arrIntegers) {
			if(max < integer) {
				max = integer;
			}
		}
		System.out.println("Phần tử có giá trị lớn nhất là : " + max);
		scanner.close();
	}
}
