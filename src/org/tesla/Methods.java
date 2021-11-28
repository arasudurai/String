package org.tesla;

public class Methods {
	
	public static void main(String[] args) {
		
		String d = "Selenium java";
		
		String d1 = "Frame works";
		
		int l = d.length();
		System.out.println(l);
		
		boolean t = d.isEmpty();
		System.out.println(t);
		
		char m = d.charAt(5);
		System.out.println(m);
		
		int s = d.indexOf(3);
		System.out.println(s);
		
		int a1 = d.lastIndexOf(4);
		System.out.println(a1);
		
		String v = d.toUpperCase();
		System.out.println(v);
		
		
		String b = d.toLowerCase();
		System.out.println(b);
		
		
		boolean y = d.startsWith("S");
		System.out.println(y);
		
		boolean z = d.endsWith("j");
		System.out.println(z);
		
		
		
		boolean k = d.contains(v);
		System.out.println(k);
		
		
		boolean g = d.equals(d1);
		System.out.println(g);
		
		
		boolean g1 = d.equalsIgnoreCase(d1);
		System.out.println(g1);
		
		
		String c = d.concat(d1);
		System.out.println(c);
		
		
		
		String re = d.replace("a", "e");
		System.out.println(re);
		
		
		String re2 = d.replaceAll("Selenium","java");
		System.out.println(re2);
		
		String tr = d.trim();
		System.out.println(tr);
		
		
		String[] sp = d.split(d);
		System.out.println(sp);
		
		String str = d.substring(4,6);
		System.out.println(str);
		
		int com = d.compareTo(d1);
	    System.out.println(com);
		
		
		
	}

}
