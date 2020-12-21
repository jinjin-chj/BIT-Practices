package java_12_15;

/*.��Ģ���� ���⸦ �Ʒ��� �������� ¥�ÿ�.
-interface(�����κ� ���� �θ�, �������� �ڼ� �����) , 
���� ó�� ��Ŀ����(/0�̳� int�� ���� �Է��ϴ� ��)�� �����Ұ�.
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
