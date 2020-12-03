/*10.아래와 같이 계산기 프로그램을 작성하시오.
==================================
10 + 9   // 입력을 한칸씩 띄우도록 할것
10 + 9 = 19
계속하시겠습니까?
10 - 7
10 - 7 = 3
계속하시겠습니까?
 */
public class Calculator {

	private int num1;
	private String ch;
	private int num2;
	double result = 0;

	public Calculator(int num1, String ch, int num2) {
		this.num1 = num1;
		this.ch = ch;
		this.num2 = num2;
	}

	public void result() {
		if (ch == "+") {
			result = (num1 + num2);
			System.out.print(num1 + " + " + num2 + " = " + result);
		} else if (ch == "-") {
			result = (num1 - num2);
			System.out.print(num1 + " - " + num2 + " = " + result);
		} else if (ch == "*") {
			result = (num1 * num2);
			System.out.print(num1 + " * " + num2 + " = " + result);
		} else if (ch == "/") {
			result = (num1 / num2);
			System.out.print(num1 + " / " + num2 + " = " + result);
		} else if ((ch == "/") && (num1 == 0 || num2 == 0)) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

}
