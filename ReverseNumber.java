package com.assignmentDay2;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Integer Value ");
		int value=sc.nextInt();
		int values=value;
		int reverse=0;
		while (values > 0) {
			int remainder=values%10;
		reverse=(reverse*10)+remainder;	
		values=values/10;
		}			
		System.out.println(reverse);
		}
}
