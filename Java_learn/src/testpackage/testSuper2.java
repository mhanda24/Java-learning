package testpackage;

public class testSuper2 extends testSuper{
	public int id = 2;
	public String name;
	public String designation;
	
	public testSuper2(){
		System.out.println("testSuper2 constructor1");
		
	}
	
	
	public testSuper2(int id, String name, String designation){
		this(id,name);
		this.designation=designation;
		System.out.println("testSuper2 constructor2");
		
	}
	
	public testSuper2(int id, String name){
		this(id);
		this.name=name;
		System.out.println("testSuper2 constructor3");
		
	}
	
	public testSuper2(int id){
		this();
		this.id=id;
		System.out.println("testSuper2 constructor4");
		
	}
	
	
	public void printId(){
		System.out.println(super.id);
	}
	
	
	
}
