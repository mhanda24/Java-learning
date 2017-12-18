package testConcurrency;

public class StartingThreads {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Task1());
		Thread t2 = new Thread(new Task1());
		Thread t3 = new Thread(new Task1());
		
		
		t1.start();
		
		try{
			t1.join();
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		t2.start();
		t3.start();
		
	
		

	}

	
	
}


class Task1 implements Runnable{

	@Override
	public void run() {
		try{
			printhello();
			Thread.sleep(1000);
			
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}
	
	void printhello(){
		for (int i = 1; i<=5;i++){
			System.out.println("Hello person " + i + " .I am Thread " + Thread.currentThread().getName());
		}
		
	}
	
	
}
