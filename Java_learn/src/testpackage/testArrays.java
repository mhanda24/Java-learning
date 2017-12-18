package testpackage;

public class testArrays {

	
	public static double[] calculateGPA(int[] studentIds, char[][] studentGrades){
		double[] GPAlist = new double[studentIds.length];
		int i = 0;
		
			for(char[] studentGrade:studentGrades){
					double gpa=0.0;
					for(char grade : studentGrade){
						if(grade == 'A'){
							gpa+=4.0;
						}else if(grade=='B'){
							gpa+=3.0;
						}else if(grade=='C'){
							gpa+=2.0;
						}
					}
					
				GPAlist[i++]=Math.round((gpa/studentGrade.length)*100)/100D;
				
		
		}
		return GPAlist;
		
		
	}
	
	public static void main(String[] args) {
		
		int[] studentIds={1001,1002,1003,1004};
		char[][] studentGrades = {{'A','A','B','A'},{'B','A','C'},{'A','B','A'},{'A','A','C'}};
		 
		int count=0;
		
		double[] output = calculateGPA(studentIds,studentGrades);
		
		for(double i:output){
				System.out.println(studentIds[count] + " has a " + i + " gpa." );
				count++;
		}

		
	}

}
