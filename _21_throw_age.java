package Assignment_core_java;

import java.util.Scanner;

public class _21_throw_age {
//	W.A.J.P to create the validate method that takes integer value as a parameter. If the
//	age is less than 18, then throw an Arithmetic Exception otherwise print a message
//	welcome to vote.
//	O/P- Enter your age: 16
//	Exception in thread main java. Lang. Arithmetic Exception: not valid 

			
		
		
	public static void demo()
	{
		
	
		
		int age = 0;
		System.out.println("enter your age");
		Scanner  sc = new Scanner(System.in);
		age = sc.nextInt();
		
		
		try {
			
			
			if(age<=18)
			{
				System.out.println("you are not eligible for voting");
			}
			else
			{
				System.out.println("welcome for voting");
			}
			
		} catch ( ArithmeticException e) {
			
			
	        System.out.println(e);
	      
	
			
			
			
		}}

	

	
	public static void main(String[] args) {

		demo();
}

}
