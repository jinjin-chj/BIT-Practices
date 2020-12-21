package java_12_15; //12-16 ������ _ �ܹ���

abstract class Calc {
	protected int a, b = 0;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();
}

class Add extends Calc {

	@Override
	public int calculate() {
		return a + b;
	}
}

class Sub extends Calc {

	@Override
	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc {

	@Override
	public int calculate() {
		return a * b;
	}
}

class Div extends Calc {

	@Override
	public int calculate() {
		if (b == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		return a / b;
	}
}
