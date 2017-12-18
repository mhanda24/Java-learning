package Basics;
import java.io.*;  

public class testExceptionMethodOverRiding {

}


class Parent{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class TestExceptionChild extends Parent{  
  void msg()throws ArithmeticException{  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]) throws Exception{  
   Parent p=new TestExceptionChild();  
   p.msg();  
  }  
}
