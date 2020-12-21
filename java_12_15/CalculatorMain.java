package java_12_15;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = null;
		ICalculator cal = new Calculator();

		while (true) {
			sc = new Scanner(System.in);
			try {
				System.out.println("���� ���� (���� ������ ����)");

				System.out.print("�Է�: ");

				int x = sc.nextInt();
				char op = sc.next().charAt(0);
				int y = sc.nextInt();

				System.out.print("���: ");

				cal.Calculator(x, op, y);
				cal.run();

			} catch (Exception e) {
				System.out.println("���α׷� ����...");

			}
			System.out.println(">> ��� �Ͻðڽ��ϱ�? (y/n)");

			char anwser = sc.next().charAt(0);
			if (anwser == 'Y' || anwser == 'y')
				continue;
			else
				break;
		}
		sc.close();
		System.out.println("���α׷� ����.");
	}

}
