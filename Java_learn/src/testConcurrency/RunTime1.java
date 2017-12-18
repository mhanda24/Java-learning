package testConcurrency;

public class RunTime1{  
	 public static void main(String args[])throws Exception{  
	  Runtime.getRuntime().exec("notepad");//will open a new notepad
	  System.out.println(Runtime.getRuntime().availableProcessors());  
	  //Shutdown
	  //Runtime.getRuntime.exec("shutdown -s -t 0")
	  
	  
	  Runtime r = Runtime.getRuntime();
	  
	  System.out.println("Total memory " + r.totalMemory());
	  System.out.println("Total memory " + r.freeMemory());
	  
	  for(int i=0;i<10000;i++){  
		 new RunTime1();  
		  }  
	  
	  
	  System.out.println("Free memory after creating 1000 instances " + r.freeMemory());
	  System.gc();
	  
	  System.out.println("After gc() ; Free memory " + r.freeMemory());
	  
	 }  


}
