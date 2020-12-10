package Thurs;

class PointMain02 {

	public static void main(String[] args) {
		ColorPoint02 zeroPoint = new ColorPoint02();
		// (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");

		ColorPoint02 cp = new ColorPoint02(10, 10);
		// (10,10) 위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}
