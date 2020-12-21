package java_12_16;

interface Shape {
	final double PI = 3.14; // ���

	void draw(); // ������ �׸��� �߻� �޼ҵ�

	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�

	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle implements Shape {
	int rad = 0;

	public Circle(int rad) {
		this.rad = rad;
	}

	@Override
	public void draw() {
		System.out.println("�������� " + rad + "�� ���Դϴ�.");
	}

	@Override
	public double getArea() {

		return rad * rad * PI;
	}

}

class Oval implements Shape {
	int width, height = 0;

	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + " x " + height + "�� �����ϴ� Ÿ���Դϴ�.");

	}

	@Override
	public double getArea() {
		return width * height * Math.PI;
	}

}

class Rect implements Shape {
	int width, height = 0;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + " x " + height + "ũ���� �簢���Դϴ�.");
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
