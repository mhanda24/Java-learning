package JAVA7ProgramTest;

public class Question36 {
	static int[] array = {1,2,3,4,5};
	public static void main(String[] args) {
				
		System.out.println(array[1]);
		System.out.println(array[4]);
		
		System.arraycopy(array, 2, array, 1, 2);
		System.out.println(new Question36().toString());
		System.out.println(array[1]);
		System.out.println(array[4]);
	}

	public String toString(){
		return array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4];
		
	}
}
