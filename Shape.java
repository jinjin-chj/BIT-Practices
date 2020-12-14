package java_12_14;

abstract class Shape {	
	// Ŭ������ ����� ������ ���ο��� ��� ��Դ��� ��.
	Point p;	// �̰� �� ���� �����ߴ��� ��.

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}

}

class Circle extends Shape {
	double r = 0;
	final double PI = 3.14;

	// ������ ���ο��� �ʿ��� �Լ��� ������µ� ���� ������� ��.
	Circle(double r) {
		this(new Point(0, 0), r);
	}

	Circle(Point p, double r) {
		super(p);
		this.r = r;

	}

	@Override	// ��� �� ������ ���� ������ ���°�.

	double calcArea() {
		return r * r * PI;
	}
}

class Rectangle extends Shape {

	double width, height = 0;

	Rectangle(double width, double height) {
		this(new Point(0, 0), width, height);
	}

	Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return width * height;
	}

	boolean isSquare() {
		return (width - height == 0 && width * height != 0);

	}

}
