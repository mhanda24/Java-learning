package Basics;

public class basicDemo1 {
	
	static void labelContinue(){
		int num=0;
		outerloop: for (int i=0;i<10;i++){
			for (int j=0;j<10;j++){
					if (i==5 && j==5){
						continue outerloop;
					}
				num++;
			}
			
		}
		System.out.println(num);

	}
	
	

	public static void main(String[] args) {
		//labelContinue();
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<num.length;i++){
				

		}
		
		}		
		
		


	}


