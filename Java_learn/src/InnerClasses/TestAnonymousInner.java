package InnerClasses;

public class TestAnonymousInner{

	public static void main(String[] args) {
		
		Person p = new Person(){
			void eat(){
				System.out.println("nice fruits");
			}
			void drink(){
				System.out.println("Drinking water");
			}
		};
		
		p.eat();
		p.drink();
	}

	

}
