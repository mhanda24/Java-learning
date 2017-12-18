package Basics;

public class testThrow2 {
	
	int divide(int a ,int b) throws ArithmeticException{
		int div=0;
		try{
		div = a/b;
		}catch(ArithmeticException e){
			System.out.println("Sorry wrong input. 0 not allowed as diviser");
		}
		return div;
		}

	public static void main(String[] args) {
		testThrow2 t2 = new testThrow2();
		System.out.println(t2.divide(20, 0));
		System.out.println(t2.divide(20, 10));
		System.out.println(t2.divide(200, 20));
		
	}

}
