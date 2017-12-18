package Basics;

public class basicDemo {

	String title;
	
public basicDemo(String title){
	this.title=title;
}
	
public void setTitle(String title){
	this.title=title;
}


	public static void main(String[] args) {
		
		basicDemo obj = new basicDemo("Testing");
		System.out.println(obj.title);
		obj.setTitle("Java");
		System.out.println(obj.title);
		
		basicDemo obj2 = new basicDemo("C#");
		
		basicDemo temp = new basicDemo(obj.title);
		
		System.out.println(temp.title);
		
		obj = obj2;
		System.out.println(obj.title);
		System.out.println(temp.title);
		
		Integer i1 = new Integer(25);
		Integer i2 = new Integer(25);
		System.out.println(i1==i2);
		
	}

}
