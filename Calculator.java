/*10.�Ʒ��� ���� ���� ���α׷��� �ۼ��Ͻÿ�.
==================================
10 + 9   // �Է��� ��ĭ�� ��쵵�� �Ұ�
10 + 9 = 19
����Ͻðڽ��ϱ�?
10 - 7
10 - 7 = 3
����Ͻðڽ��ϱ�?
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
			System.out.println("0���� ���� �� �����ϴ�.");
		}

	}

}
