package com.na.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Class18 {
	public static void main(String[] args) {
		ArrayList<Float> arrListFloat = new ArrayList<>();
		arrListFloat.add(0.7f);
		arrListFloat.add(7.26f);
		arrListFloat.add(1.02f);
		arrListFloat.add(9.3f);
		Iterator<Float> iterator = arrListFloat.iterator();
		System.out.println("Cac phan tu co trong arrListFloat la: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
	}

}
