package java_12_15; //12-16 ������ _ �ܹ���

import java.util.Scanner;

/*
9.ö�� �л��� ���� 3���� �ʵ�� �޼ҵ带 ���� 4���� Ŭ���� Add, Sub, Mul, Div�� �ۼ��Ϸ��� �Ѵ�.
- int Ÿ���� a, b �ʵ�: 2���� �ǿ�����
- void setValue(int a, int b): �ǿ����� ���� ��ü ���� �����Ѵ�.
- int calculate(): Ŭ������ ������ �´� ������ �����ϰ� ����� �����Ѵ�.

�����غ���, Add, Sub, Mul, Div Ŭ������ ����� �ʵ�� �޼ҵ尡 �����ϹǷ� 
���ο� �߻� Ŭ���� Calc�� �ۼ��ϰ� Calc�� ��ӹ޾� ����� �ǰڴٰ� �����ߴ�.
 
�׸��� main() �޼ҵ忡�� ���� ���� ��ʿ� ���� 2���� ������ �����ڸ� �Է¹��� ��,(Scanner)
Add, Sub, Mul, Div �߿��� �� ������ ó���� �� �ִ� ��ü�� �����ϰ� (new~)
setValue() �� calculate()�� ȣ���Ͽ�(��ü.set~) �� ��� ���� ȭ�鿡 ����ϸ� �ȴٰ� �����Ͽ���. 
ö��ó�� ���α׷��� �ۼ��϶�.

�� ������ �����ڸ� �Է��Ͻÿ� >> 5 7 +
 */
class CalcMain {
	public static void main(String[] args) {
		Scanner sc = null;

		while (true) {
			System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
			sc = new Scanner(System.in);

			try {
				int a = sc.nextInt();
				int b = sc.nextInt();
				char op = sc.next().charAt(0);

				Calc cal = null;

				switch (op) {
				case '+':
					cal = new Add();

					break;

				case '-':
					cal = new Sub();
					break;

				case '*':
					cal = new Mul();
					break;

				case '/':
					cal = new Div();
					break;

				default:
					System.out.println("�߸��� �����Դϴ�.");

				}
				cal.setValue(a, b);
				System.out.println(a + " " + op + " " + b + " = " + cal.calculate());

			} catch (Exception e) {
				System.out.println("������ �߻��߽��ϴ�.");

				System.out.print("��� �Ͻðڽ��ϱ�? (y/n) >> ");

				sc = new Scanner(System.in);

				char anwser = sc.next().charAt(0);

				if (anwser == 'Y' || anwser == 'y')
					continue;
				else
					break;

			}

			System.out.print("��� �Ͻðڽ��ϱ�? (y/n) >> ");
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
