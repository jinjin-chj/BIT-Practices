package java_12_16;

interface Shape {
	final double PI = 3.14; // 상수

	void draw(); // 도형을 그리는 추상 메소드

	double getArea(); // 도형의 면적을 리턴하는 추상 메소드

	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
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
		System.out.println("반지름이 " + rad + "인 원입니다.");
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
		System.out.println(width + " x " + height + "에 내접하는 타원입니다.");

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
		System.out.println(width + " x " + height + "크기의 사각형입니다.");
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
