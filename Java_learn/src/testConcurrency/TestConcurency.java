package testConcurrency;
import java.util.concurrent.TimeUnit;

public class TestConcurency {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Task task = new Task();
		Thread thread = new Thread(task);//New State
		thread.start(); //Runnable state
		
		try {
			//thread.sleep(3000);
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Inside Main..");
	}

}

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run...");
		go();
		
	}
	
	public static void go(){
		System.out.println("Inside Go..");
		Come();
	}
	
	public static void Come(){
		System.out.println("Inside Come...");
		
	}
	
}
