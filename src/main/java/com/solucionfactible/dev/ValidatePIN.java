package com.solucionfactible.dev;

import java.util.regex.Pattern;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything
 * but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
public class ValidatePIN {

	public static boolean isValid(String pin) {

		if (Pattern.matches("(\\d{4}|\\d{6})", pin)) {
			System.out.println("valido: " + pin);
		}else{
			System.out.println("invalido:" + pin);
		}

		return Pattern.matches("(\\d{4}|\\d{6})", pin);
	}

}
