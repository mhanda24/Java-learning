package Basics;

public class Student {
	
	int id;
	String name;
	String gender;
	char[] grade;
	
	Student(int id, String name, String gender, char[] grade){
	this(name);	
	this.id=id;
	this.gender=gender;
	this.grade=grade;
	}
	
	Student(String name){
	this.name=name;
		
	}
	
	boolean updateprofile(String name){
		this.name=name;
		return true;
		
	}
	
	String updateprofile1(String name){
		String oldvalue=this.name;
		System.out.println("oldname is " + oldvalue);
		this.name=name;
		return oldvalue;
		
	}

}
