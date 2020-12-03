
/*10.아래와 같이 계산기 프로그램을 작성하시오.
==================================
10 + 9   // 입력을 한칸씩 띄우도록 할것
10 + 9 = 19
계속하시겠습니까?
10 - 7
10 - 7 = 3
계속하시겠습니까?
 */
import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner scanner = null;

		while (true) {
			System.out.println("계산기 시작");
			scanner = new Scanner(System.in);

			int num1 = scanner.nextInt();
			String ch = scanner.nextLine();
			int num2 = scanner.nextInt();

			Calculator cal = new Calculator(num1, ch, num2);
			cal.result();
			System.out.println(cal.result);

			System.out.println("계속 하시겠습니까?");

			char anwser = scanner.next().charAt(0);
			if (anwser == 'Y' || anwser == 'y')
				continue;
			else
				break;
		}
		scanner.close();
		System.out.println("프로그램 종료.");
	}

}
