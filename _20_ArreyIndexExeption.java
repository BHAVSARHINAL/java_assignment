package Assignment_core_java;

import java.util.Scanner;

public class _20_ArreyIndexExeption {
	
//	W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero
//			exception and another one is to handle
//			ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0; 
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("start code");
		Scanner sc = new Scanner(System.in);
		try {
			
			int arrey[]= {10,20,30};
			System.out.println("arrey "+arrey[3]);
		} catch ( ArrayIndexOutOfBoundsException e) {
		
			System.out.println(e);
		}
		
	}

}
