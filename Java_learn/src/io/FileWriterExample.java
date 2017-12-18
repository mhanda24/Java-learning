package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\seleniumIO\\text.txt");
			
			String text = "This is FileWriter class";
			
			fw.write(text);
			fw.flush();
			fw.close();
			System.out.println("Success...");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}


	}

}
