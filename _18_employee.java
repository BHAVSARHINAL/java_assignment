package Assignment_core_java;

import java.util.Scanner;

//	Create a class named 'Member' having the following members:
//		1. Data members
//		2. Name
//		3. Age
//		4. Phone number
//		5. Address
//		6. Salary
//		It also has a method named 'printSalary' which prints the salary of the members
public class _18_employee {
	
	Scanner sc = new Scanner(System.in);
	
		int age;
		String name,address;
		long mobile;
		
		Double salary;

		
		
		void AcceptDetails()
		{
		    System.out.println("enter your age");
		    age = sc.nextInt();
		    
		    System.out.println("enter your name");
		    name = sc.next();
		    
		    System.out.println("enter your mobile");
		    mobile = sc.nextLong();
		    
		    System.out.println("enter your address");
		    address= sc.next();
		    
		    System.out.println("enter your salary");
		    salary = sc.nextDouble()
		    		;
		}
		
	void showdetails()
	{
		System.out.println("age: ="+age);
		System.out.println("\nname = " +name);
		System.out.println("\nmobile = "+mobile);
		
		System.out.println("\naddress =  "+address);
		System.out.println("\nsalary = "+salary);
	
		
	}
	
	public static void main(String[] args) {
		
		_18_employee em =new _18_employee();
		em.AcceptDetails();
		em.showdetails();

	}

}
