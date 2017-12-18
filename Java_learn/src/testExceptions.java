
public class testExceptions {
	
	public static int myMethod(int a,int b) throws ArithmeticException, NullPointerException{
		int c=0;
		c= a/b;		
		return c;
		
	}
	
	
	public static void main(String[] args) {
		
		try{
		int d = myMethod(20, 20);
		System.out.println(d);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
