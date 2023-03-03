package Assignment_core_java;

public class _06_triangle_pattern {

	public static void main(String[] args) {
		
//		Write a program in Java to make such a pattern like right angle triangle with number
//		increased by 1 The pattern like: 
		
		int num =1;
		for(int j=1;j<=4;j++)
		{
			for(int m=1;m<=j;m++)
			{
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println();
		}
		
		
		
		
		

	}

}
