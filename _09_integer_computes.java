package Assignment_core_java;

import java.util.Scanner;

public class _09_integer_computes extends _07_length {

	public static void main(String[] args) {
//		• Write a Java program that accepts an integer (n) and computes the value of
//		n+nn+nnn. Input number: 5 
//		

		
int num;
   Scanner sc = new Scanner(System.in);
   System.out.println("input number:");
   num=sc.nextInt();
   System.out.printf("%d + %d%d + %d%d%d" ,num,num,num,num,num,num);
	}

}
