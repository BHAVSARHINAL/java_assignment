package Assignment_core_java;



//• Create a class with a method that prints "This is a parent class" and its subclass with
//another method that prints "This is child class". Now, create an object for each of
//the class and call 1 - method of parent class by object of parent class 2 - method of
//child class by object of child class 3 - method of parent class by object of child class
class perents
{
	public void perents()
	{
		System.out.println("this is a perents class");
	}
	
	
	
}
class child extends perents
{
	public void set()
	{
		System.out.println("this is child class");
	}
}

class child2 extends child
{
	
}
	
 public class _17_inheritance{
public static void main(String[] args) {
   child2 ch = new child2();
   ch.set();
  ch.perents();
}
 }
