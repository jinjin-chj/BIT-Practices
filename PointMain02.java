package Thurs;

class PointMain02 {

	public static void main(String[] args) {
		ColorPoint02 zeroPoint = new ColorPoint02();
		// (0,0) ��ġ�� BLACK �� ��
		System.out.println(zeroPoint.toString() + "�Դϴ�.");

		ColorPoint02 cp = new ColorPoint02(10, 10);
		// (10,10) ��ġ�� BLACK �� ��
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
	}

}
