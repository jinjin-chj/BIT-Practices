package java_hello;

public class OnlyExitReturn {

	public static void main(String[] args) {
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
	}
	
	public static void divide(int num1, int num2) {
		if(num2 ==0) {		// 예외 조항 -> 에러 안 나게
			System.out.println("0으로 나눌 수 없습니다.");
			return;		// 값의 반환 없이 메소드만 종료!! 함수가 void여도 return이 올 수 있구나!
		}
		
		System.out.println("나눗셈 결과: " + (num1 / num2));
		
	}

}
