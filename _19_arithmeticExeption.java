package Assignment_core_java;

import java.util.Scanner;


//Take two numbers from the user and perform the division operation and handle
//Arithmetic Exception. O/P- Enter two numbers: 10 0
//Exception in thread main java.lang.ArithmeticException:/ by zero 
public class _19_arithmeticExeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("start code");
		Scanner  sc = new Scanner(System.in);
		
		try {
			
			System.out.println("enter the value of A=");
			int a = sc.nextInt();
			
			System.out.println("enter the value od B=");
			int b=sc.nextInt();
			
			int c = a/b;
			System.out.println("division of c= "+c);
			
			
		} catch ( ArithmeticException e) {
			System.out.println(e);
		}

	}

}
