
/*10.�Ʒ��� ���� ���� ���α׷��� �ۼ��Ͻÿ�.
==================================
10 + 9   // �Է��� ��ĭ�� ��쵵�� �Ұ�
10 + 9 = 19
����Ͻðڽ��ϱ�?
10 - 7
10 - 7 = 3
����Ͻðڽ��ϱ�?
 */
import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner scanner = null;

		while (true) {
			System.out.println("���� ����");
			scanner = new Scanner(System.in);

			int num1 = scanner.nextInt();
			String ch = scanner.nextLine();
			int num2 = scanner.nextInt();

			Calculator cal = new Calculator(num1, ch, num2);
			cal.result();
			System.out.println(cal.result);

			System.out.println("��� �Ͻðڽ��ϱ�?");

			char anwser = scanner.next().charAt(0);
			if (anwser == 'Y' || anwser == 'y')
				continue;
			else
				break;
		}
		scanner.close();
		System.out.println("���α׷� ����.");
	}

}
