import java.util.Scanner;

public class MoneyMain {

	public static void main(String[] args) {
		// ȭ�� ���� ���ϴ� ���α׷� �����
		Scanner scanner = null;
		while(true) {
			scanner = new Scanner(System.in);
			System.out.println("�ݾ��� �Է��ϼ���.");
			int money = scanner.nextInt();
			
			Money result = new Money(money);
			result.temp();
			
			System.out.println("����Ͻðڽ��ϱ�? (Y / N)");
			char ch = scanner.next().charAt(0);
			if (ch == 'Y' || ch == 'y')
				continue;
			else
				break;

		}
		scanner.close();
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

		

	}

}
