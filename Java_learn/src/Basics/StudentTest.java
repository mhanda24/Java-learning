package Basics;

public class StudentTest {

	public static void main(String[] args) {
		int[] StudentsIds = new int[]{1001,1002,1003};
		
		Student Student1 = new Student(StudentsIds[0],"max","male",new char[] {'A','B'});
		Student Student2 = new Student(StudentsIds[1],"tam","male", new char[] {'C','D'});
		Student Student3 = new Student(StudentsIds[2],"bobby","female",new char[]{'E','F'});
		
		
		System.out.println("Studnet 1 name is " + Student1.name + Student1.grade[0]);
		System.out.println("Studnet 2 name is " + Student2.name);
		System.out.println("Studnet 3 name is " + Student3.name);
		
		Student2.updateprofile1("tom");
		
		Student Student4 = new Student(1004,"Mani","female", new char[] {'A','A'});
		
		System.out.println("Studnet 2 updated name is " + Student2.name);
		
		
		System.out.println(Student4.name + " - " +  Student1.name );
		
		
		
	}

}
