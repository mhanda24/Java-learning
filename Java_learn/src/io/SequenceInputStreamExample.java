package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {

	public static void main(String[] args) {
		
		try{
			FileInputStream fIn1 = new FileInputStream("C:\\seleniumIO\\text.txt");
			FileInputStream fIn2 = new FileInputStream("C:\\seleniumIO\\text2.txt");
			FileOutputStream fOut = new FileOutputStream("C:\\seleniumIO\\textout.txt");
			SequenceInputStream sIn = new SequenceInputStream(fIn1, fIn2);
			
			//Reading data from 2 files but no writing
			/*
			int i = 0;
			while((i=sIn.read())!= -1){
				System.out.println((char)i);
			}
			*/
			long starttime = System.currentTimeMillis();
			
			//Reading data from 2 files and writing in 3rd file
			int i = 0;
			while((i=sIn.read())!=-1){
				fOut.write(i);
			}
			long endtime = System.currentTimeMillis();
			System.out.println(endtime - starttime);
			
			sIn.close();
			fIn1.close();
			fIn2.close();
			System.out.println("Success...");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
