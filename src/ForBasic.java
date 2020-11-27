
public class ForBasic {		// for문 이용 구구단어쩌고

	public static void main(String[] args) {
		// 6. int dan = 3; 이용, 구구단 3단 뿌리기
		
		int dan = 3;
		
		for(int i = 1; i < 10; i++) {	//구구단 공식 외우기!!
			System.out.println(dan + " x " + i + " = " + (i * dan));
		}
		
		System.out.println('\n');
		
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("I love Java");
		}
	}

}
