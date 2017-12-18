package Basics;

public class Employee {

	private String name;
	private int id;
	
	Employee(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	Employee(Employee e){
		this.name=e.name;
		this.id=e.id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Employee empDetails(){
		Employee Emp = new Employee(this);
		System.out.println(Emp.name + "  " + Emp.id);
		return Emp;
		
	}
	
}
