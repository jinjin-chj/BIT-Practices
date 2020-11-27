
public class WhileBasic {

	public static void main(String[] args) {

		int num = 0;
		
		while(num < 5) {	//5보다 작은 값까지 돈다. false 일때 빠져나옴
			System.out.println("I like Java " + num);
			num++;
		}
		
		
		System.out.println('\n');
		
		// do ~ while문 연습
		int num1 = 0;
		do {
			System.out.println("I like Java " + num1);
			num1++;
							
		} while(num1 < 5);
		
	}

}
