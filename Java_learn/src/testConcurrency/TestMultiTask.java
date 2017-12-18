package testConcurrency;

public class TestMultiTask {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			public void run(){
				System.out.println(Thread.currentThread().getName() + " Task one");
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				System.out.println(Thread.currentThread().getName() + " Task two");
			}
		};
		
		t1.start();
		t2.start();
		

	}

}
