package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		
		try{
			FileOutputStream fOut = new FileOutputStream("C:\\seleniumIO\\text.txt", true);
			BufferedOutputStream bOut = new BufferedOutputStream(fOut);
			String s = ". SAecond Line. Welcome to Java tutorials in JavaTPoint.com";
			byte[] b = s.getBytes();
			bOut.write(b);
			bOut.flush();
			bOut.close();
			fOut.close();
			System.out.println("Success....");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
