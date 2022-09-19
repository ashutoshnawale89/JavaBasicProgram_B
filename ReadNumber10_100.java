package com.assignmentDay2;

import java.util.Scanner;

public class ReadNumber10_100 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Integer Value (10/100/1000/10000)");
		int value=sc.nextInt();
		switch(value) {
		case (0): System.out.println("ZERO");
		break;
		case (10): System.out.println("TEN");
		break;
		case (100): System.out.println("HUNDREAD");
		break;
		case (1000): System.out.println("ONE THOUSAND");
		break;
		case (10000): System.out.println("TEN THOUSAND");
		break;
		case (100000): System.out.println("ONE LAKH");
		break;
		default: System.out.println("The value enter incorrect");
		}

	}

}
