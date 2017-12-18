package Basics;

import java.util.Scanner;

public class temperature_convert {

	public static void main(String[] args) {
		
		System.out.println("Please enter the celsius value ");
		
		Scanner sc = new Scanner(System.in);
		double celsius = sc.nextDouble();
		double f = 9.0 / 5.0 * celsius + 32.0;
		
		System.out.println("Fahrenheit value is " + f);

	}

}
