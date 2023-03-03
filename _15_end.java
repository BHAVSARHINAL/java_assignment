package Assignment_core_java;

public class _15_end {
//	W.A.J.P to check whether a given string ends with the contents of another string.
//	"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 
	
	public static void main(String[] args) {
		
		String s1 = new String("hello world");
		
		String s2 = "Java Exercises";
		String s3 = "Java Exercise";
		
		if(s2.equals(s3))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
		
	}
}
