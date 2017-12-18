package Basics;

public class arrays {

	public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
		double[] gpaList = new double[studentIdList.length];
		int count = 0;
		
		for (char[] studentGrade : studentsGrades) {
			double gpa = 0.0;
			
			for (char grade : studentGrade) {
				if (grade == 'A') {
					gpa += 4.0;
				} else if (grade == 'B') {
					gpa += 3.0;
				} else if (grade == 'C') {
					gpa += 2.0;
				}
			}
			
			gpaList[count++] = gpa/studentGrade.length;
		}
		
		return gpaList;
	}
	
	public static double[] calculateGPA1(int[] studentIdList, char[][] studentsGrades) {
		double[] gpaList = new double[studentIdList.length];
		double sum = 0.00;
		double number=0.00;
		double gradescount =0.00;
		 
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
			
				 gpaList[i] = sum/gradescount;
				 		sum = 0.00;
				
			 }
		
		return gpaList;
	}
	 
	
	  public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
	        
		  double[] gpalist = calculateGPA1(studentIdList, studentsGrades);
		  for (int i=0;i<studentIdList.length;i++){
			  
			  	if(gpalist[i]>=lower && gpalist[i]<=higher){
				  return studentIdList;  
			  }else {
				  return null;
			  }
		  }
		return studentIdList;
	  }
	    
	public static void main(String[] args) {

		int[] studentIdList = {1001,1002};
		char[][] studentsGrades={{'A','A','A','B'},{'A','B','A'}};
		
		 double[] output = calculateGPA(studentIdList, studentsGrades);
		int[] studentId = getStudentsByGPA(3.70, 3.80, studentIdList, studentsGrades);
		 System.out.println(output.length);
		for(int i=0; i<output.length;i++){
		System.out.println(output[i]);
		System.out.println(studentId[i]);
		}
	}

}
