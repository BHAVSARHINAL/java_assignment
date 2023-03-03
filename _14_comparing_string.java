package Assignment_core_java;

import javax.swing.Spring;

public class _14_comparing_string {

	
//	W.A.J.P to compare a given string to the specified character sequence. Comparing
//	topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false 
	
	public static void main(String[] args) {
		
		String s1 = new String("hello world");
		
		String s2= ("topsint.com");
		String s3= ("topsint.com:");
		
		if(s2.equals(s3))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
