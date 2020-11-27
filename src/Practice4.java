
public class Practice4 {

	public static void main(String[] args) {
		// 문제1. num 값이 홀수면 true, 짝수면 false
		
		int num = 9;
		boolean result;
		result = ((num % 2) != 0);
		//System.out.println(num + "는 " + result + " 입니다.");
		
		
		// 문제2. num이 양수면 true, 음수면 false
		
		int num1 = 1000;
		boolean result1;
		result1 = (num1 > 0);		// 0은..false
		//System.out.println(num1 + "은 " + result1 + "입니다.");
		
		
		// 문제3. n 가지고 true 결과 도출하기
		
		int n1 = 100;
		int n2 = 90;
		int n3 = 80;
		
		boolean isBig = (n1 > n2) && (n1 > n3);		// 그렇구나~~~~~
		System.out.println(isBig);
		
		
		
	}

}
