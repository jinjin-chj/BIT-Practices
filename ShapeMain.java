
/* * ���� Ŭ������ ����ϰ� �Լ� �������̵� �ϴ�, Circle�� ����ÿ�. 
 * ���� ���� �����ϴ� �Լ�. Rectangle��.
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
		// �տ� Shape�� �Ѱ�, ������ ���� �� ����.

		System.out.println(circle.getArea());
		System.out.println(rec.getArea());

	}

}
