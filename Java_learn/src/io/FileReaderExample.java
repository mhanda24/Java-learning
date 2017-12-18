package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("C:\\seleniumIO\\text.txt");
			int i;
			while((i=fr.read()) != -1){
				System.out.println((char)i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
