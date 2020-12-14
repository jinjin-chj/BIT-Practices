package java_12_14;

abstract class Shape {	
	// 클래스들 만들긴 했지만 메인에서 어떻게 써먹는지 모름.
	Point p;	// 이거 왜 변수 선언했는지 모름.

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

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

	// 솔직히 메인에서 필요한 함수라 만들었는데 무슨 기능인지 모름.
	Circle(double r) {
		this(new Point(0, 0), r);
	}

	Circle(Point p, double r) {
		super(p);
		this.r = r;

	}

	@Override	// 얘는 왜 위에다 쓰면 에러가 나는가.

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
