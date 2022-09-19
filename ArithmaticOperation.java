package com.assignmentDay2;

import java.util.Scanner;

public class ArithmaticOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value1");
		int value1=sc.nextInt();
		System.out.println("enter the value2");
		int value2=sc.nextInt();
		System.out.println("enter the value3");
		int value3=sc.nextInt();
		int sum1=value1+value2*value3;
		int sum2=value1/value2+value3;
		int sum3=value1%value2+value3;
		int sum4=value1*value2+value3;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

	}

}
