
public class SwitchBasic {	

	public static void main(String[] args) {
		// switch - case 문
		
		int n = 1;	//100으로 하면 "디폴트"랑(빠져나와서) 그 밑에만 출력됨
		
		switch(n) {
			case 1:
				System.out.println("Simple Java");
				
			case 2:
				System.out.println("Funny Java");
				
			case 3:
				System.out.println("Fantastic Java");
				//break만나면 switch {}빠져나옴
			default:
				System.out.println("The best programming language");	
		}
		
		System.out.println("Do you like Java?");

	}

}
