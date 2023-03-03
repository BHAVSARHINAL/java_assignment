package Assignment_core_java;

import java.util.Scanner;

public class _11_divisible_by_3_5 {

//	Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
//	and by both. 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("print any number");
		
		
      
for(int num=1;num<=100;num++)
{
if(num%3==0)
{
	System.out.println("num divided by 3="+num);
}

else if(num%5==0)
{
	System.out.println("num divided by 5="+num);
}
else if(num%15==0)
{
	System.out.println("num divided by 15="+num);
}

}
}}