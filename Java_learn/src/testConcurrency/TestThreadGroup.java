package testConcurrency;

public class TestThreadGroup {

	public static void main(String[] args) {
		ThreadGroupDemo runnable = new ThreadGroupDemo();
		
		ThreadGroup tg1 = new ThreadGroup("Parent Thread Group");
		
		Thread t1 = new Thread(tg1,runnable,"One");
		t1.start();
		
		Thread t2 = new Thread(tg1,runnable,"two");
		t2.start();
		
		Thread t3 = new Thread(tg1,runnable,"three");
		t3.start();
		
		//Thread.currentThread().getThreadGroup().interrupt();
		System.out.println("Thread Group name " + tg1.getName());
		
		tg1.list();
	}

}
class ThreadGroupDemo implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}