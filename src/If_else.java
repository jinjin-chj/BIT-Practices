
public class If_else {

	public static void main(String[] args) {
		int n1 = 5;		// -> 메모리 할당
		int n2 = 7;
		
		// if문
		if(n1 < n2) {
			System.out.println("n1 > n2 is true.");
		
		}
		
		//if ~ else 문 -> 결괏값이 1개만 나옴
		if(n1 == n2) {
			System.out.println("n1 == n2 is true.");
		}
		else  {
			System.out.println("n1 == n2 is false.");
		}
	}

}
