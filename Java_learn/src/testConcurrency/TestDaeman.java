package testConcurrency;

public class TestDaeman {

	public static void main(String[] args) {
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		TestThread t3 = new TestThread();

		t1.setDaemon(true);
		t1.start();

		t2.start();
		t3.start();
	}

}


class TestThread extends Thread{

	public void run(){
		System.out.print(" Name " + Thread.currentThread().getName());
		System.out.println(" Deaman " + Thread.currentThread().isDaemon());

	}

}
