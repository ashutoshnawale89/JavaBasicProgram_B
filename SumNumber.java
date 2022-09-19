package com.assignmentDay2;

import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Integer Value ");
		int value=sc.nextInt();
		int sum=0;
		int i=0;
		while(value >= i) { 
			sum=sum+i;
			i++ ;
		}
		System.out.println(sum);

	}

}
