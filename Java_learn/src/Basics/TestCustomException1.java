package Basics;

class TestCustomException1{  
	  
	   static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("Invalid Age");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   
	     
	   public static void main(String args[]){  
	      try{  
	      validate(17);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  