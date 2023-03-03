package Assignment_core_java;


//Create a class to print the area of a square and a rectangle. The class has two methods
//with the same name but different number of parameters. The method for printing
//area of a rectangle has two parameters which are length and breadth respectively
//while the other method for printing area of square has one parameter which is side
//of square. 




class square
{
	int l;

	public square(int l) {
		
		System.out.println(l*l);
		
	}
	public void reactangle(float l , int b )
	{
		
		
	System.out.println(l*b);
	}
}

public class _16_square {
	

	public static void main(String[] args) {
		
		square sq = new square(4);
		sq.reactangle(5,3);
		
	}

}
