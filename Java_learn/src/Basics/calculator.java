package Basics;

import java.util.Scanner;

public class calculator {

	Scanner sc = new Scanner(System.in);
	
	
//Caluclator application
	static int add(int a, int b){
		int sum = a + b;
		return sum;
	}
	
	static int subtract(int a, int b){
		int diff=a - b;
		return diff;
	}
	static double divide(double a, double b){
		double div=a/b;
		return div;
	}
	static int multiply(int a, int b){
		int mul=a * b;
		return mul;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Addition of 2 numbers -" + add(100,300));
		System.out.println("Subtraction of 2 numbers -" + subtract(500,300));
		System.out.println("Division of 2 numbers -" + divide(10,20));
		System.out.println("multiplication of 2 numbers -" + multiply(25, 37));
	
	
	
	
	}

}


