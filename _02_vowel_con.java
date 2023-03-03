package Assignment_core_java;

import java.util.Scanner;

public class _02_vowel_con {
	
	
//	Write a Java program that takes the user to provide a single character from the
//	alphabet. Print Vowel or Consonant, depending on the user input. If the user input
//	is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
//	message. 
	public static void main(String[] args) {
		char ch = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any charactor");
		ch=sc.next().charAt(0);
		int length = 0;
		
		

		
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		
	{
		System.out.println("this is a vowel");
	}
		
	else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		System.out.println("THIS IS A VOWEL");
	}
	
	
	else if(length!=1)
	{
		System.out.println("this is error message");
	}
	else
	{
		System.out.println("this is consosnant");
	}
	
	}
	}

