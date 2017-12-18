package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		
		try{
		FileInputStream fIn = new FileInputStream("C:\\seleniumIO\\text.txt");
		BufferedInputStream bIn = new BufferedInputStream(fIn);
		
		int i = 0;
		while((i = bIn.read())!= -1){
		System.out.println((char)i);
		}
		bIn.close();
		fIn.close();
		System.out.println("Success...");
		}catch(Exception e){
			e.getMessage();
		}
	}
	
}
