package Basics;

public class testExceptions {

	public static void main(String[] args) {
		
		try{
			try{
				System.out.println("First try print");
				int data = 30/0;
				System.out.println("First try print2");
			}catch(ArithmeticException  e){
				System.out.println(e);
			}
			System.out.println("Code after first try");
			try{
				System.out.println("Second try print");
				int a[]=new int[5];
				a[5] = 50/10;
				System.out.println("Second try print2");
				}catch(ArithmeticException e){
					System.out.println(e);
					}  
				   catch(ArrayIndexOutOfBoundsException e){
					   System.out.println(e);
					   }  
			System.out.println("Code after second try");
		}catch(Exception e){
			   System.out.println("common task completed");
			   } 
		finally{
			System.out.println("Finally code");
		}
		System.out.println("rest of the code...");  

	}

}
