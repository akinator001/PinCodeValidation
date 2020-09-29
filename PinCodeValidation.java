package com.cp.pincode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class PinCodeValidation {
	
	static Scanner sc = new Scanner(System.in);

	public void pinCodeValidator() {
		System.out.println("Enter your Pin Code :");
		String pinCode = sc.next();
		
		Pattern pattern = Pattern.compile("^([1-9])(\\S){2}(\\s)?\\S{2}[0-9]$");
		Matcher matcher = pattern.matcher(pinCode);
		Boolean bool = matcher.find();
		if (bool)
			System.out.println("Pin Code is Validated");
		else
			System.out.println("Please enter the correct Pin Code");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to pin validation.");
	    PinCodeValidation pinCodeValidation = new PinCodeValidation();
	    pinCodeValidation.pinCodeValidator();

	}

}
