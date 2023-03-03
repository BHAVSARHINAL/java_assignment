package Assignment_core_java;

import java.util.Scanner;

//    Write a Java program to Take three numbers from the user and print the greatest
//number. 

public class _01_print_greter_no {

	public static void main(String[] args) {
		
int a,b,c;
Scanner sc =new  Scanner(System.in);

System.out.println("PRINT ANY THREE NUMBER");

System.out.println("first num is");
  a = sc.nextInt();
  
System.out.println("second num is");
 b= sc.nextInt();
 
System.out.println("third num is");
c = sc.nextInt();
System.out.println("a,b,c in higest value print...");
if(a>b)
{
	System.out.println("print a= "+a);
}

else if(b>c)
{
	System.out.println("print b= "+b);
}
else if(c>a)
{
	System.out.println("print c= "+c);
}










	}

}
