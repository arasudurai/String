package org.tesla;

public class Literal {
	
	public static void main(String[] args) {

	String s = "Summa";
	String s1 = "iruda";
	String s2 = "Summa";
	
	
	int one = System.identityHashCode(s);
	System.out.println(one);
	
	int two = System.identityHashCode(s1);
	System.out.println(two);
	
	int three = System.identityHashCode(s2);
	System.out.println(three);
	
	
	}
}
