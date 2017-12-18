package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		
		try{
		FileOutputStream fOut = new FileOutputStream("C:\\seleniumIO\\text.txt", true);
		
		/*
		//write byte
		fOut.write(65);
		*/
		
		//write String after converting to byte array
		//String s = "Welcome to javaTPoint";
		
		//Apend the file, call constructor with true
		String s = ". This is a second line";
		byte[] b = s.getBytes();
		fOut.write(b);
		
		
		fOut.close();
		System.out.println("Success...");
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
