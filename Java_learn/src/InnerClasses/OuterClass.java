package InnerClasses;

public class OuterClass {
	private int data = 30;
	
	public class InnerClass{
		void msg(){
			System.out.println("Value of data is " + data);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		OuterClass OC = new OuterClass();
		OuterClass.InnerClass IC = OC.new InnerClass();
		IC.msg();

	}

}
