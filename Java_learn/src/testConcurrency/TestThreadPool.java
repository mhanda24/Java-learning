package testConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {
		ExecutorService threadExecute = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<10;i++){
		ThreadPool thread = new ThreadPool("" +i);
		threadExecute.execute(thread);
		}
		
		threadExecute.shutdown();
		
		while(!threadExecute.isTerminated()){
			
		}System.out.println("All threads finished");
		

	}

}


class ThreadPool implements Runnable{

	private String message;
	
	public ThreadPool(String message){
		this.message=message;
	}
	
	
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start message " + message);
		processThread();
		System.out.println(Thread.currentThread().getName() + " end ");
	}
	
	void processThread(){
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
