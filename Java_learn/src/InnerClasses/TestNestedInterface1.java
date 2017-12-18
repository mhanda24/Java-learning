package InnerClasses;


interface Showable{
	void show();
	
	interface Message{
		void msg();
	}
}

public class TestNestedInterface1 implements Showable.Message{

	public static void main(String[] args) {
		
		Showable.Message Member=new TestNestedInterface1();
		Member.msg();
	}

	@Override
	public void msg() {
		System.out.println("Hello message interface inside showable interface");
		
	}

}
