package java_12_15;

/*.사칙연산 계산기를 아래의 조건으로 짜시오.
-interface(구현부분 없는 부모, 구현담은 자손 만들기) , 
예외 처리 메커니즘(/0이나 int에 문자 입력하는 등)을 적용할것.
 */
interface ICalculator {

	public void Calculator(int x, char op, int y);

	void run();
}

class Calculator implements ICalculator {
	private int x, y;
	private char op;

	@Override
	public void Calculator(int x, char op, int y) {
		this.x = x;
		this.op = op;
		this.y = y;
	}

	@Override
	public void run() {

		int result = 0;

		switch (op) {
		case '+': {
			result = x + y;
			break;
		}
		case '-': {
			result = x - y;
			break;
		}
		case '*': {
			result = x * y;
			break;
		}
		case '/': {
			result = (x / y);
			break;
		}
		}
		System.out.println(x + " " + op + " " + y + " = " + result);

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getOp() {
		return op;
	}

	public void setOp(char op) {
		this.op = op;
	}

}
