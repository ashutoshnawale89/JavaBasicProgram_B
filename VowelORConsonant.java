package com.assignmentDay2;

import java.util.Scanner;

public class VowelORConsonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Characte in alphabets");
		String value=sc.next();
		switch(value) {
		case ("a"): System.out.println("Is Vowel ");
		break;
		case ("e"): System.out.println("Is Vowel");
		break;
		case ("i"): System.out.println("Is Vowel");
		break;
		case ("o"): System.out.println("Is Vowel");
		break;
		case ("u"): System.out.println("Is Vowel");
		break;
		case ("A"): System.out.println("Is Vowel");
		break;
		case ("E"): System.out.println("Is Vowel");
		break;
		case ("I"): System.out.println("Is Vowel");
		break;
		case ("O"): System.out.println("Is Vowel");
		break;
		case ("U"): System.out.println("Is Vowel");
		break;
		default: System.out.println("The Characte enter Consonant");
		}
	}
}
