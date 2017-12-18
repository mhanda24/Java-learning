package testAbstract;

public class concreteClass extends abstractSubclass{
	@Override
	void test2(){
		System.out.println("Test2");
	}
	@Override
	void test3(){
		System.out.println("Test3");
	}


	
	public static void main(String[] args) {
		concreteClass c1 = new concreteClass();
		c1.test1();
		c1.test2();
		c1.test3();

	}
	



}
