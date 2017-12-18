package io;

import java.io.Console;

public class ReadStringTestConsole {

	public static void main(String[] args){
		Console cnsl = null;
		String name = null;
		cnsl = System.console();
		name = cnsl.readLine("Name: ");
		System.out.println("Name entered : " + name);
		

	}
}
