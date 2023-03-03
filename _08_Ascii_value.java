package Assignment_core_java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class _08_Ascii_value {

	public static void main(String[] args) throws Exception {
		
		
//		Write a Java program to print the ASCII value of a given character
		
		
		FileOutputStream fo = new FileOutputStream("get.txt");
		String s = "this is fileouput string";
		byte [] b=s.getBytes();
		fo.write(b);
		fo.close();
		fo.flush();
		
		
		
		System.out.println("file input successfull");
		
		FileInputStream fi = new FileInputStream("get.txt");
		int i ;
		while((i=fi.read())!=-1)
		{
			System.out.println(i);
		}
		
		
		
	}

}
