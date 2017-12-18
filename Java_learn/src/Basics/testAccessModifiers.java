package Basics;

import testpackage.acessModifiers;

public class testAccessModifiers {

	public static void main(String[] args) {
		
		acessModifiers obj1 = new acessModifiers("Max","Male");
		acessModifiers obj2 = new acessModifiers("Mani","female");
		
		System.out.println(obj1.getName());
		
		obj1.setName("Tom");
		
		System.out.println(obj1.getName());
		
		//obj1.setId(obj2.getId());
		
		System.out.println(obj1.getId());
		
		System.out.println(acessModifiers.getCounter());
	
		
		
	}

}
