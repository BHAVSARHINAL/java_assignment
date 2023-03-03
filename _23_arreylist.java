package Assignment_core_java;

import java.util.ArrayList;

public class _23_arreylist {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(10.10);
		al.add("tops");
		al.add('r');
		al.add(true);
		al.add(null);
		al.add(10.10);
		System.out.println(al);
		
		System.out.println(al.get(5));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.remove(3));
		System.out.println(al);

}}
