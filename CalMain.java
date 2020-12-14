package java_12_14;

public class CalMain {

	public static void main(String[] args) {

		// 방법1. 다이렉트

		Calculator cal = new Calculator();

		System.out.println(cal.add(10, 10));
		System.out.println(cal.sub(10, 10));
		System.out.println(cal.mul(10, 10));
		System.out.println(cal.div(10, 10));

		// 방법2. 폴리몰티즘 적용 (권장하는 방법)

		ICalculate cal2 = new Calculator();

		System.out.println(cal.add(10, 10));
		System.out.println(cal.sub(10, 10));
		System.out.println(cal.mul(10, 10));
		System.out.println(cal.div(10, 10));

	}

}
