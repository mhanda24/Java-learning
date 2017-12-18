package Basics;

public class testStrings {

	public static void main(String[] args) {
		
		String s = "Hello,World!";
		/*System.out.println(s);
		System.out.println("s.contains(\"Hello World!\"): " + s.contains("world!"));
		System.out.println("s.indexof(\"o\"): " + s.indexOf("o"));
		System.out.println("s.lastindexof(\"o\"): " + s.lastIndexOf("o"));
		//Which character exists at that index
		System.out.println(s.charAt(4));
		
		System.out.println(s.substring(0, 10));
		//System.out.println(s.compareTo("HELLO WORLD!"));
		//System.out.println(s.compareToIgnoreCase("HELLo WORLD!"));
		//System.out.println(s.contentEquals("Hello world!"));
		System.out.println(s.startsWith("h"));
		System.out.println(s.endsWith("d!"));
		System.out.println(s.replaceAll(",", " "));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String[] sa = s.split("o");
		for(String temp:sa){
			System.out.println(temp);
		}
		
		*/
		String a = s;
		String b = "Hello,World!";
		String c = new String("Hello,World!");
		System.out.println(a);
		System.out.println(b.equals(s));
		System.out.println(b==c);
		System.out.println();
		/*
		StringBuffer sb = new StringBuffer(s);
		sb.append(" Good").append(" Morning :) ");
		System.out.println("sb.String: " + sb.toString());
		System.out.println("sb.length: "+ sb.length());
		sb.delete(1, 5);
		System.out.println("sb.String: " + sb.toString());
		System.out.println("sb.length: "+ sb.length());
		sb.insert(25, "ey");
		System.out.println("sb.String: " + sb.toString());
		System.out.println("sb.length: "+ sb.length());
		
		StringBuilder sb1 = new StringBuilder(s);
		sb1.insert(s.length(), " Good Morning :)");
		System.out.println(sb1);
	*/}

}
