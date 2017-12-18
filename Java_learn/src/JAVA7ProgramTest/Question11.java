package JAVA7ProgramTest;

import java.io.IOException;

public class Question11 {

	public static void main(String[] args) {
		try{
			doSomething();
		}catch(RuntimeException | IOException e){
			System.out.println(e.getMessage());
		}

	}
	
	static void doSomething() throws IOException {
		
		if(Math.random()>0.5) throw new IOException();
		throw new RuntimeException();
	}

}
