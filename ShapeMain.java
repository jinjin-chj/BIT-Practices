
/* * 위의 클래스를 상속하고 함수 오버라이딩 하는, Circle을 만드시오. 
 * 원의 넓이 리턴하는 함수. Rectangle도.
 */
package Fri;
class Shape {
	public double getArea() {
		return 0.0;
	}
}

class Circle extends Shape {
	private double rad;

	Circle(double rad) {
		this.rad = rad;
	}

	public double getArea() {
		final double PI = 3.14;
		return rad * rad * PI;
	}
}

class Rectangle extends Shape {
	private double width;
	private double height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {

		return width * height;
	}
}

public class ShapeMain {
	public static void main(String[] args) {
		Shape circle = new Circle(10);
		Shape rec = new Rectangle(3, 4);	
		// 앞에 Shape로 한건, 다형성 적용 한 예임.

		System.out.println(circle.getArea());
		System.out.println(rec.getArea());

	}

}
