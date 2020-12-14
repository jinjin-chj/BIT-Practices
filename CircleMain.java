package java_12_14;
/*
Object obj = new Circle(10);
System.out.println(obj);
=================
���: ���̴� 100 �Դϴ�.
*/

class Circle2 {
	private double rad = 0;
	private final double PI = 3.14;

	public Circle2(double rad) {
		this.rad = rad;

	}

	public double getArea() {
		return rad * rad * PI;
	}

	@Override
	public String toString() {

		return ("���̴� " + getArea() + " �Դϴ�.");	// �ڲ� �Լ��� ()�� ���԰� getArea�� ���ϱ� ��������
	}
}

class CircleMain {

	public static void main(String[] args) {
		Object obj = new Circle2(10);
		System.out.println(obj);
	}
}
