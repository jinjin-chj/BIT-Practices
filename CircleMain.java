package java_12_14;
/*
Object obj = new Circle(10);
System.out.println(obj);
=================
출력: 넓이는 100 입니다.
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

		return ("넓이는 " + getArea() + " 입니다.");	// 자꾸 함수에 ()를 빼먹고 getArea만 쓰니까 에러나지
	}
}

class CircleMain {

	public static void main(String[] args) {
		Object obj = new Circle2(10);
		System.out.println(obj);
	}
}
