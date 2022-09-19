package com.assignmentDay2;

import java.util.Scanner;

public class SpringSeasonFind {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		System.out.println("enter the month");
		int month=sc.nextInt();
		if (year == 2020) {
			if (month >=3 && month <= 6) {
				System.out.println("True");
			}
			else 
				System.out.println("False");
		}
		else 
			System.out.println("Enter The Correct year");
		}
		
}
