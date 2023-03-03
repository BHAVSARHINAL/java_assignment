package Assignment_core_java;

import java.util.HashMap;

public class _24_hashset {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1,"Ramesh");
		hm.put(2, "Suresh");
		hm.put(3, "Mahesh");
		hm.put(4, "Mangesh");
		hm.put(5, "Haresh");
		hm.put(5, "Rajesh");
		System.out.println(hm);
		
		System.out.println(hm.get(3));
		hm.remove(5);
		System.out.println(hm);
		System.out.println(hm.size());
	}

}

