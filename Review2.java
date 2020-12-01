package java_hello;

public class Review2 {

	/*
	public static void main(String[] args) {
		
	// 원 넓이 구하기
		
		double area = getCircleArea(10.0);
		System.out.println("원의 넓이는 " + area);

	}
	
	public static double getCircleArea(double rad) { 
		final double PI = 3.14;		// 상수!이고 남들이 수정 못 하게.
		double area = rad * rad * PI; 	//math.PI;
		return area;	// 함수정의에서 void로 안했으니까 리턴값 써줘야함 -> 근데 어떻게 리턴타입이 있고 없고를 알지? 없으면 void.
		
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
