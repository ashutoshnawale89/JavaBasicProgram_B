package com.assignmentDay2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		// Math.sqrt(25);
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		int values=value;
		int reverse=0;
		
		for(int i=0; values > i;) {
			int remainder=values%10;
			reverse=(reverse*10)+remainder;
			values=values/10;
		}
		int checkPalindrom=reverse-value;
		if (checkPalindrom==0)
			System.out.println("The Number Is Palindrome");
		else 
			System.out.println("The Number is Non-Palindrome");	
	}

}
