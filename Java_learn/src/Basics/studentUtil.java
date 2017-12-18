package Basics;

public class studentUtil {

	public static void main(String[] args) {
		int[] studentIdList = {101,102,103,104,105};
		char[][] studentsGrades = {{'A','A','A','B'},{'A','B','A'},{'A','B','B'},{'A','B','A'},{'A','B','A'}};
		double sum = 0.00;
		 double GPA = 0.00;
		 double number=0.00;
		 double gradescount =0.00;
		 double min = 3.50;
		 double max = 3.70;
		 
			 for (int i = 0; i<studentIdList.length;i++){
				 for (int j = 0; j<studentsGrades[i].length;j++){
				 
				
					if(studentsGrades[i][j] == 'A'){
						 	number = 4.00;
					 } else if (studentsGrades[i][j] == 'B'){
						 	number = 3.00;
					 }else if (studentsGrades[i][j] == 'C'){
						 	number = 2.00;
					 }
						 
						sum = sum + number;
						gradescount = studentsGrades[i].length;
				 }
			
				 		GPA = sum/gradescount;
				 		sum = 0.00;
				 		System.out.println("GPA of student " + studentIdList[i] + " is " + GPA);
				 		
				 		if (GPA <= min){
				 			System.out.println("Student is fail");
				 		}else if (GPA>=max){
				 			System.out.println("Student is passed");
				 		}else{
				 			System.out.println("Student has more than min but less than max numbers");
				 		}
			 }
			 System.out.println(GPA);
	}
	}



