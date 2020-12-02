import java.util.Scanner;

public class MoneyMain {

	public static void main(String[] args) {
		// 화폐 갯수 구하는 프로그램 만들기
		Scanner scanner = null;
		while(true) {
			scanner = new Scanner(System.in);
			System.out.println("금액을 입력하세요.");
			int money = scanner.nextInt();
			
			Money result = new Money(money);
			result.temp();
			
			System.out.println("계속하시겠습니까? (Y / N)");
			char ch = scanner.next().charAt(0);
			if (ch == 'Y' || ch == 'y')
				continue;
			else
				break;

		}
		scanner.close();
		System.out.println("프로그램이 종료되었습니다.");

		

	}

}
