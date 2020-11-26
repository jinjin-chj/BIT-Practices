
public class UseVariable {

	public static void main(String[] args) {
		int num1;		// 변수 num1의 선언
		num1 = 10;		// 변수 num1에 10을 저장
		
		int num2 = 20;		// 변수 num2 선언과 동시에 20으로 초기화
		int num3 = num1 + num2;		// 두 변수 값을 대상으로 덧셈
		System.out.println(num1 + " + " + num2+ " = " + num3);

	}

}

/* 복습
 * 변수란 무엇인가: 값을 저장할 수 있는 메모리 상의 공간(방)
 * int num; 이란? num이라는 4바이트짜리 메모리(방).정수만 가능. = 변수 선언
 * 문자가 뿌려지는 원리? char ch; char형 메모리에 문자를 넣으면 아스키 코드표에 있는 해당 코드값이 매칭되어 출력
 * */
