package Assignment_core_java;

import java.util.Scanner;

public class _03_year_is_leap_year_not {
	
	
//	Write a Java program that takes a year from user and print whether that year is a leap
//	year or not. B19. Write a program in Java to display the first 10 natural numbers
//	using while loop. 

	public static void main(String[] args) {
		
		 
	int year;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter year");
	year =sc.nextInt();
	
	if(year%4==0)
	{
		System.out.println("This is LEAP year ");
	}
	else
	{
		System.out.println("This is NOT a leap year");
	}
	System.out.println();
	
	System.out.println("print first 10 natural number");
	for(int i = 1;i<=10;i++)
	{
		
		
		
		System.out.println(i);
	}
	
	
	
	}

}
