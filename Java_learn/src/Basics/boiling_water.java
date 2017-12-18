package Basics;

import java.util.Scanner;

public class boiling_water {

	public static void main(String[] args) {
		System.out.println("What is the boiling water temp");
		Scanner sc = new Scanner(System.in);
		
		int boiling_temp = sc.nextInt();
		
		if(boiling_temp < 100){
			System.out.println("Water is not hot yet");
		}else if(boiling_temp >= 100 && boiling_temp <= 120){
			System.out.println("water is warm");
		}else
		{
			System.out.println("water is hot");
		}

	}

}
