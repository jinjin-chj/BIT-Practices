package java_12_14;

public class CalMain {

	public static void main(String[] args) {

		// ���1. ���̷�Ʈ

		Calculator cal = new Calculator();

		System.out.println(cal.add(10, 10));
		System.out.println(cal.sub(10, 10));
		System.out.println(cal.mul(10, 10));
		System.out.println(cal.div(10, 10));

		// ���2. ������Ƽ�� ���� (�����ϴ� ���)

		ICalculate cal2 = new Calculator();

		System.out.println(cal.add(10, 10));
		System.out.println(cal.sub(10, 10));
		System.out.println(cal.mul(10, 10));
		System.out.println(cal.div(10, 10));

	}

}
