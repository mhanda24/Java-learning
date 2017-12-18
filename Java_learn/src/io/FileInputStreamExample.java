package io;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		
		try{
			FileInputStream fIn = new FileInputStream("C:\\seleniumIO\\text.txt");
			/*read single byte
			int i = fIn.read();
			System.out.println((char)i);
			*/
			
			//Read full string
			int i;
			while((i=fIn.read())!= -1){
				System.out.println((char)i);
			}
			
				
			fIn.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
		}

	}

}
