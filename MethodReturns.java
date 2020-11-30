package java_hello;

public class MethodReturns {

	public static void main(String[] args) {	// 결론은 이거야! 라고 말해주고 밑에서 각각 함수 정의 // void:리턴할 값이 없다!!
		int result;
		result = adder(4,5);	//adder라는 함수 호출(사용) // adder가 반환하는 값을 result에 저장
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " + square(3.5));	//square함수 호출
	}
	
	public static int adder(int num1, int num2) {		//adder함수 정의 // 변수 선언 식으로! int sth
		int addResult = num1 + num2;
		return addResult;		//addResult의 값을 반환
	}
	
	public static double square(double num) {		// square함수 정의
		return num * num ;		//num*num의 결과를 반환
	}
}
