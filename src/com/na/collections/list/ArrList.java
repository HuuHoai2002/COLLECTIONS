package com.na.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
	public static void main(String[] args) {
		ArrayList<Character> arrListChar = new ArrayList<>();
		arrListChar.add('a');
		arrListChar.add('e');
		arrListChar.add('b');
		arrListChar.add('c');
		Iterator<Character> listIterator = arrListChar.listIterator();
		System.out.println("Cac phan tu co trong arrListChar la: ");
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + "\t");
		}
	}

}