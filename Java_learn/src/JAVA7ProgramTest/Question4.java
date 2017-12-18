package JAVA7ProgramTest;

public class Question4 {
	int z;
	public static void main(String[] args) {
		Question4 pt = new Question4();
		int z = 6;
		System.out.println(z);
		pt.dostuff();
		System.out.println(z);
		System.out.println(pt.z);

	}
	
	void dostuff(){
		int z = 5;
		System.out.println(z);
		dostuff2();
	}
	
	void dostuff2(){
		z=4;
	}

}
