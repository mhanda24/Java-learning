package testpackage;

/**
 * 
 * @author mhanda200
 *
 */
public class acessModifiers {
	
	private static int idinitializer=1000;
	private final int id;
	
	private String name;
	private String gender;
	
	private static int counter;
	
	
	public acessModifiers(String name, String gender){
		this.name=name;
		this.setGender(gender);
		id = ++idinitializer;
		counter++;
		System.out.println("id " + id + " for " + name);
		
	}
	
	{
		System.out.println("Initalizing variables through Constructor");
	}
	
	public static int getCounter() {
		return counter;
	}

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male") || gender=="female" || gender=="transgender"){
		this.gender = gender;
		}else{
			throw new IllegalArgumentException("wrong gender passed");
		}
		
	}
	
	
	
	
	

}
