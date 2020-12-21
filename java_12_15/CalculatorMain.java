package java_12_15;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = null;
		ICalculator cal = new Calculator();

		while (true) {
			sc = new Scanner(System.in);
			try {
				System.out.println("계산기 시작 (숫자 연산자 숫자)");

				System.out.print("입력: ");

				int x = sc.nextInt();
				char op = sc.next().charAt(0);
				int y = sc.nextInt();

				System.out.print("계산: ");

				cal.Calculator(x, op, y);
				cal.run();

			} catch (Exception e) {
				System.out.println("프로그램 에러...");

			}
			System.out.println(">> 계속 하시겠습니까? (y/n)");

			char anwser = sc.next().charAt(0);
			if (anwser == 'Y' || anwser == 'y')
				continue;
			else
				break;
		}
		sc.close();
		System.out.println("프로그램 종료.");
	}

}
