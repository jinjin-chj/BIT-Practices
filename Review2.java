package java_hello;

public class Review2 {

	/*
	public static void main(String[] args) {
		
	// �� ���� ���ϱ�
		
		double area = getCircleArea(10.0);
		System.out.println("���� ���̴� " + area);

	}
	
	public static double getCircleArea(double rad) { 
		final double PI = 3.14;		// ���!�̰� ������ ���� �� �ϰ�.
		double area = rad * rad * PI; 	//math.PI;
		return area;	// �Լ����ǿ��� void�� �������ϱ� ���ϰ� ������� -> �ٵ� ��� ����Ÿ���� �ְ� ���� ����? ������ void.
		
	}
	*/
	public static void main(String[] args) {
		starPrint(5);
	}
	
	public static void starPrint(int num) {

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
