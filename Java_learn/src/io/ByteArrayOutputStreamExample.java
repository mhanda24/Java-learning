package io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) {
		
		try{
		FileOutputStream fOut1 = new FileOutputStream("C:\\seleniumIO\\text.txt");
		FileOutputStream fOut2 = new FileOutputStream("C:\\seleniumIO\\text2.txt");
		
		ByteArrayOutputStream bOut = new ByteArrayOutputStream();
		
		bOut.write(65);
		
		bOut.writeTo(fOut1);
		bOut.writeTo(fOut2);
		
		bOut.close();
		fOut1.close();
		System.out.println("success...");
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}	

}
