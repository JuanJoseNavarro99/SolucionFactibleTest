package com.solucionfactible.dev;

import java.util.ArrayList;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping
 * their order.
 * 
 * @author developer
 */
public class ArrayDiff {

	public static int[] diff(int[] a, int[] b) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();

		if (a.length == 0) {// Validate if <a> is an empty array return empty array
			int[] emptyArray = new int[0];
			System.out.println("a vacio");
			return emptyArray;
		}
		if (b.length == 0) {// Validate if <b> is an empty array return <a> array 
			System.out.println("b vacio");
			return a;
		}
		for (int i = 0; i <= a.length - 1; i++) {// Serch <a> values in <b> 
			boolean found = false;
			Integer x = a[i];
			for (int j = 0; j <= b.length - 1; j++) {
				
				if (x == b[j]) {
					found = true;
					break;
				}

			}
			if (!found) {// if not found add value to <newArray>
				newArray.add(x);
			}
		}
		
		int[] result = newArray.stream().mapToInt(value -> value.intValue()).toArray();//convert array list to array
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.println(" ");
		return result;
	}

}
