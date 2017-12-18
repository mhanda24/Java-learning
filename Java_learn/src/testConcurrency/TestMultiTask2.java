package testConcurrency;

public class TestMultiTask2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MultiTasks());
		Thread t2 = new Thread(new MultiTasks());
		
		
		Thread t3 = new Thread(new MultiTasks2());
		Thread t4 = new Thread(new MultiTasks2());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}

class MultiTasks implements Runnable{

	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + " Task " +Thread.currentThread());
	}
	
	
}

class MultiTasks2 implements Runnable{

	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + " Task " +Thread.currentThread().getId());
	}
	
	
}
