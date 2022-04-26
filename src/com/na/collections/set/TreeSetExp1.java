package com.na.collections.set;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExp1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeSet<Integer> treeSetIntegers = new TreeSet<>();
		treeSetIntegers.add(0);
		treeSetIntegers.add(2);
		treeSetIntegers.add(7);
		treeSetIntegers.add(3);
		System.out.println("Các phần tử có trong treeSet là: " + treeSetIntegers);
		System.out.println("Nhập phần tử cần thêm : ");
		int n = scanner.nextInt();
		if(!treeSetIntegers.contains(n)) {
			treeSetIntegers.add(n);
			System.out.println("Thêm thành công!");
			System.out.println("Các phần tử sau khi thêm là : " + treeSetIntegers);
		} else {
			System.out.println("Phần tử " + n + " đã tồn tại");
		}
		scanner.close();
	}
}
