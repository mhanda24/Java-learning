package JAVA7ProgramTest;

public class Question10 {

	public static void main(String[] args) {
		String[] table = {"aa","bb","cc"};
		System.out.println(table.length);
		for (String ss : table){
			int ii = 0;
			
			while(ii<table.length){
				System.out.println(ss + " " + ii);
				ii++;
			}
			
		}
	}

}
