package JAVA7ProgramTest;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Bob = new Student();
		Student John = new Student();
		
		Bob.name="Bob";
		Bob.age=20;
		
		Bob.display();
		
		John = Bob;
		
		John.display();
		
		John.name="John";
		
		John.display();
		Bob.display();

		
		
	}

}

class Student{
	
	public String name;
	public int age=0;
	
	void display(){
		System.out.println("name " + this.name + " age " + this.age);
	}
	
	
}
