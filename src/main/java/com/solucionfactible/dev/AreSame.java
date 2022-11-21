package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same
 * multiplicities. "Same" means,
 * here, that the elements in b are the elements in a squared, regardless of the
 * order.
 * 
 * @author developer
 */
public class AreSame {

	public static boolean comp(int[] a, int[] b) {

		for (int i = 0; i <= a.length - 1; i++) {
			boolean found = false;
			int x = a[i] * a[i];
			for (int j = 0; j <= b.length - 1; j++) {

				if (x == b[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}
		return true;
	}

}
