package com.assignmentDay2;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value1");
		double value1=sc.nextDouble();
		System.out.println("enter the value2");
		double value2=sc.nextDouble();
		double distance = (double) Math.sqrt(value1*value1 + value2*value2);
		System.out.println("The distance is ; "+distance);
	}
}
