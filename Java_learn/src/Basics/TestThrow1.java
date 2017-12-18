package Basics;

import java.io.IOException;

public class TestThrow1{  
	   static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   
	   void m() throws ArithmeticException{  
		    throw new java.lang.ArithmeticException("System error");//checked exception 
		    
		  }  
		  void n() throws Exception{  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();
		     }catch(Exception e){System.out.println("exception handeled");}  
		  }   
	  
	   
	 public static void main(String args[]){  
	     try{ 
		 validate(13);
	     }catch(ArithmeticException e){
	    	 System.out.println(e);
	     }
	     TestThrow1 t1 = new TestThrow1();
	    
	     t1.p();
	     
	      System.out.println("rest of the code...");  
	  }  
	}  
