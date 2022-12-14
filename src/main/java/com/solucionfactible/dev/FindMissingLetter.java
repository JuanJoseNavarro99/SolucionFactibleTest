package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input
 * and that returns the missing letter
 * in the array. You will always get an valid array. And it will be always
 * exactly one letter be missing.
 * The length of the array will always be at least 2.The array will always
 * contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {

	public static char findMissingLetter(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i + 1 < array.length) {
				if ((int) array[i] + 1 != (int) array[i + 1]) {
					int result = (int) array[i] + 1;
					System.out.println("letra faltante: " + (char) result);
					return (char) result;
				}
			}
		}

		return ' ';
	}

}
