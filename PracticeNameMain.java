package Tuesday_1208;

class PracticeNameMain {

	public static void main(String[] args) {
		/*
		 * 입력:lee sunkyo 출력:first name: lee second name:sunkyo
		 * 
		 *	 아래는 메인으로만 프로그램 짰을 경우이다.
		 * Scanner sc = new Scanner(System.in); 
		 * System.out.println("이름을 입력하세요. (성 이름)");
		 * 
		 * String firstName, secondName, name; 
		 * name = sc.nextLine();
		 * 
		 * int firstSpace = name.indexOf(" "); 
		 * firstName = name.substring(0, firstSpace);
		 * 
		 * secondName = name.substring(firstSpace + 1);
		 * 
		 * System.out.println("First name: " + firstName + ", 
		 * Second name: " + secondName);
		 */

		PracticeName who = new PracticeName();
		who.input();
	}

}
