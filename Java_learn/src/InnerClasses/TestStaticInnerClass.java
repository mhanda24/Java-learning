package InnerClasses;

public class TestStaticInnerClass {
private static int data = 10;

	static class InnerClass{
		static void msg(){
			System.out.println("value of data is " + data);
		}
	}
	
	
	public static void main(String[] args) {
		//TestStaticInnerClass.InnerClass IC = new TestStaticInnerClass.InnerClass();
		//IC.msg();
		
		TestStaticInnerClass.InnerClass.msg();

	}

}
