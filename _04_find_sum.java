package Assignment_core_java;

import java.util.Scanner;

public class _04_find_sum {
	
//	• Write a program in Java to input 5 numbers from keyboard and find their sum and
//	average using for loop.
	

	public static void main(String[] args) {
		
		int a,b,c,d,e;
		Scanner sc = new Scanner (System.in);
		System.out.println("take a 5 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		
		System.out.println("Sum = "+(a+b+c+d+e));
		
		System.out.println("Average= "+(a+b+c+d+e)/5);
		

	}

}
