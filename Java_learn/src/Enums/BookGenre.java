package Enums;

public enum BookGenre{
		BIOGRAPHY(12){
			public boolean isKidsFriendly(int age){
				return age>=minAgeToRead;
			}
		},
		HORROR(15){
			public boolean isKidsFriendly(int age){
				return false;
			}
		};
	
	abstract public boolean isKidsFriendly(int age);

		private BookGenre(int minAgeToRead){
			this.minAgeToRead=minAgeToRead;
		}

		int minAgeToRead;
		public int getminAgeToRead(){
			return minAgeToRead;

		
		}
		
		/*public boolean isKidsFriendly(int age){
			switch(this){
			case BIOGRAPHY	:	return age>=minAgeToRead;
			case HORROR	:	return false;
			}
			return false;
		}*/

		public static void main(String[] args) {

			for(BookGenre bookGenre : BookGenre.values()){

				System.out.println(bookGenre.name() + " ordinal " + bookGenre.ordinal());
				System.out.print(bookGenre.getminAgeToRead());
				System.out.print("isKidsFreindly " + bookGenre.isKidsFriendly(12));
			}


		}


	
}