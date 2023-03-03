package Assignment_core_java;

import java.util.Scanner;

public class _07_length {

//	Write a Java program that reads a positive integer and count the number of digits the
//	number.
//	Input an integer number less than ten billion: 125463
//	Number of digits in the number: 6 
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		System.out.println("Enter  a Numer..");
		long num=sc.nextLong();
		while(num!=0)
		{
			num = num/10;
			sum++;
			
		}
		System.out.println("total no of digits is ="+sum);
	}
}
