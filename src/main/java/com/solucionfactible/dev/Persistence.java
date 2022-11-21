package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative
 * persistence, which is the number
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {

	static int counter = 0;

	public static int persistence(long num) {
		counter=0;
		splitMultiply(num);
		System.out.println("contador: "+ counter);
		return counter;
	}

	private static int splitMultiply(long x) {
		String numbers = x + "";
		if (numbers.length() <= 1) {
			return 0;
		}
		counter++;
		long result = 1;
		for (int i = 0; i < numbers.length(); i++) {
			result = result * Long.parseLong(numbers.substring(i , i + 1));
		}
		System.out.println("mi resultado: " + result);
		if (result > 9) {
			splitMultiply(result);
		}
		return 0;
	}

}
