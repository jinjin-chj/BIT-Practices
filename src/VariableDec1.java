
public class VariableDec1 {

	public static void main(String[] args) {
		double num1, num2;	// 두 개의 변수 동시 선언
		double result;
		num1 = 1.0000001;
		num2 = 2.0000001;
		result = num1 + num2;
		System.out.println(result);

	}		// 기대하는 값 3.0000002가 출력되지 않음 -> Why? 실수 표현에 오차가 존재

}
