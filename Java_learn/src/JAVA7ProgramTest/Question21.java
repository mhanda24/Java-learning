package JAVA7ProgramTest;

public class Question21 {

	public static void main(String[] args) {
		
		Question21 obj1 = new Tell();
		Tell obj2 = new Tell();
		
		obj2.tellItLikesItIs();
		
	
		
	}

}

class Tell extends Question21 implements Truth {

	@Override
	public void tellItLikesItIs() {
		System.out.println("Right on");
		
	}
	
}

interface Truth {
	public void tellItLikesItIs();
}
